// 통신 방식 - Statrful
package com.eomcs.net.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0110 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("서버 실행!");

      try (Socket socket = serverSocket.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream())) {

        System.out.println("클라이언트가 연결되었음!");

        while (true) {
          String name = in.readLine();
          if (name.equalsIgnoreCase("quit")) {
            out.println("Gooddbye!");
            out.flush();
            break;
          }
          out.printf("%s 님 반갑습니다!\n", name);
          out.flush();
        }


        // System.out.print(">");
        // .nextLine();

      }
      System.out.println("클라이언트와의 연결을 끊었음.");

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}

