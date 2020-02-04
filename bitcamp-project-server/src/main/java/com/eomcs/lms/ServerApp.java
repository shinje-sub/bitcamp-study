// LMS 서버
package com.eomcs.lms;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;

public class ServerApp {
  // 옵저버 관련 코드
  Set<ApplicationContextListener> listerers = new HashSet<>();
  Map<String, Object> context = new HashMap<>();

  public void addApplicationContextListener(ApplicationContextListener listener) {
    listerers.add(listener);
  }

  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listerers.remove(listener);
  }


  private void notifyApplicationInitialized() {
    for (ApplicationContextListener listener : listerers) {
      listener.contextInitialzed(context);
    }
  }

  private void notifyApplicationDestroyed() {
    for (ApplicationContextListener listener : listerers) {
      listener.contextDestroyed(context);
    }
  }

  // 옵저버 관련 코드 끝!

  @SuppressWarnings("unchecked")
  public void service() {

    notifyApplicationInitialized();

    List<Board> boardList = (List<Board>) context.get("boardList");
    List<Lesson> lessonList = (List<Lesson>) context.get("lessonList");
    List<Member> memberList = (List<Member>) context.get("memberList");

    try (
        // 서버쪽 연결 준비
        // => 클라이언트의 연결을 9999번 포트에서 기다린다.
        ServerSocket serverSocket = new ServerSocket(9999)) {

      System.out.println("클라이언트 연결 대기중...");

      while(true) {
        Socket socket = serverSocket.accept();
        System.out.println("클라이언트와 연결되었음!");

        processRequest(socket);

        System.out.println("----------------------------------------");
      }catch (Exception e) {
        System.out.println("서버 준비중 오류 발생!");
      }
    }

    notifyApplicationDestroyed();

  } // service()

  void processRequest(Socket clinetsocket) {
    try (Socket socket = clinetsocket;
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream())) {

      System.out.println("통신을 위한 입출력 스트림을 준비하였음!");

      String message = in.nextLine();
      System.out.println("클라이언트가 보낸 메시지를 수신하였음!");

      System.out.println("클라이언트:" + message);

      out.println("Hi!(신지섭)");
      System.out.println("클라이언트로 메시지를 전송하였음!");


    } catch (Exception e) {
      System.out.println("예외 발생:");
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    System.out.println("서버 수업 관리 시스템 입니다.");
    ServerApp app = new ServerApp();

    // 애플리케이션의 상태 정보를 받을 옵저버를 등록한다.
    app.addApplicationContextListener(new DataLoaderListener());
    app.service();
  }
}

