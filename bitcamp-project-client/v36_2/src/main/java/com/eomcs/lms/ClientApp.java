package com.eomcs.lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.lms.dao.domain.BoardDao;
import com.eomcs.lms.dao.domain.LessonDao;
import com.eomcs.lms.dao.domain.MemberDao;
import com.eomcs.lms.dao.handler.BoardAddCommand;
import com.eomcs.lms.dao.handler.BoardDeleteCommand;
import com.eomcs.lms.dao.handler.BoardDetailCommand;
import com.eomcs.lms.dao.handler.BoardListCommand;
import com.eomcs.lms.dao.handler.BoardUpdateCommand;
import com.eomcs.lms.dao.handler.Command;
import com.eomcs.lms.dao.handler.LessonAddCommand;
import com.eomcs.lms.dao.handler.LessonDeleteCommand;
import com.eomcs.lms.dao.handler.LessonDetailCommand;
import com.eomcs.lms.dao.handler.LessonListCommand;
import com.eomcs.lms.dao.handler.LessonUpdateCommand;
import com.eomcs.lms.dao.handler.MemberAddCommand;
import com.eomcs.lms.dao.handler.MemberDeleteCommand;
import com.eomcs.lms.dao.handler.MemberDetailCommand;
import com.eomcs.lms.dao.handler.MemberListCommand;
import com.eomcs.lms.dao.handler.MemberUpdateCommand;
import com.eomcs.lms.dao.mariadb.BoardDaoImpl;
import com.eomcs.lms.dao.mariadb.LessonDaoImpl;
import com.eomcs.lms.dao.mariadb.MemberDaoImpl;
import com.eomcs.lms.dao.util.Prompt;

public class ClientApp {

  Scanner keyboard = new Scanner(System.in);
  Prompt prompt = new Prompt(keyboard);

  Deque<String> commandStack;
  Queue<String> commandQueue;

  Connection con;

  HashMap<String, Command> commandMap = new HashMap<>();

  public ClientApp() throws Exception {
    // 생성자?
    // => 객체가 작업할 때 사용할 자원들을 준비하는 일을 한다.

    // 사용자가 입력한 명령어를 보관할 객체 준비
    commandStack = new ArrayDeque<>();
    commandQueue = new LinkedList<>();

    // DB 연결 객체 준비
    Class.forName("org.mariadb.jdbc.Driver");

    con = DriverManager.getConnection( //
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");

    // MariaDB와 연동하여 데이터를 처리하는 DAO 객체 준비
    BoardDao boardDao = new BoardDaoImpl(con);
    MemberDao memberDao = new MemberDaoImpl(con);
    LessonDao lessonDao = new LessonDaoImpl(con);

    // 사용자 명령을 처리할 Command 객체 준비
    commandMap.put("/board/list", new BoardListCommand(boardDao));
    commandMap.put("/board/add", new BoardAddCommand(boardDao, prompt));
    commandMap.put("/board/detail", new BoardDetailCommand(boardDao, prompt));
    commandMap.put("/board/update", new BoardUpdateCommand(boardDao, prompt));
    commandMap.put("/board/delete", new BoardDeleteCommand(boardDao, prompt));

    commandMap.put("/lesson/list", new LessonListCommand(lessonDao));
    commandMap.put("/lesson/add", new LessonAddCommand(lessonDao, prompt));
    commandMap.put("/lesson/detail", new LessonDetailCommand(lessonDao, prompt));
    commandMap.put("/lesson/update", new LessonUpdateCommand(lessonDao, prompt));
    commandMap.put("/lesson/delete", new LessonDeleteCommand(lessonDao, prompt));

    commandMap.put("/member/list", new MemberListCommand(memberDao));
    commandMap.put("/member/add", new MemberAddCommand(memberDao, prompt));
    commandMap.put("/member/detail", new MemberDetailCommand(memberDao, prompt));
    commandMap.put("/member/update", new MemberUpdateCommand(memberDao, prompt));
    commandMap.put("/member/delete", new MemberDeleteCommand(memberDao, prompt));
  }

  public void service() {

    while (true) {
      String command;
      command = prompt.inputString("\n명령> ");

      if (command.length() == 0)
        continue;

      if (command.equals("history")) {
        printCommandHistory(commandStack.iterator());
        continue;
      } else if (command.equals("history2")) {
        printCommandHistory(commandQueue.iterator());
        continue;
      } else if (command.equals("quit")) {
        break;
      }

      commandStack.push(command);
      commandQueue.offer(command);

      processCommand(command);
    }
    keyboard.close();

    try {
      con.close();
    } catch (Exception e) {
    }
  }

  private void processCommand(String command) {
    Command commandHandler = commandMap.get(command);
    if (commandHandler == null) {
      System.out.println("실행할 수 없는 명령입니다.");
      return;
    }
    commandHandler.execute();
  }

  private void printCommandHistory(Iterator<String> iterator) {
    int count = 0;
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      count++;

      if ((count % 5) == 0) {
        String str = prompt.inputString(":");
        if (str.equalsIgnoreCase("q")) {
          break;
        }
      }
    }
  }

  public static void main(String[] args) throws Exception {
    System.out.println("클라이언트 수업 관리 시스템입니다.");

    ClientApp app = new ClientApp();
    app.service();
  }
}