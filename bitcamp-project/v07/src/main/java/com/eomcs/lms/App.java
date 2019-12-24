package com.eomcs.lms;

import java.util.Scanner; 
import java.sql.Date;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in); 

    
    class Lesson{
      int no;
      String title;
      String description;
      Date StartData;
      Date EndData;
      int TotalHours;
      int dayHours;
    }
    
    final int LESSON_SIZE = 100;
    Lesson[] lessons = new Lesson[LESSON_SIZE];
    int lessoncout = 0;
    
    
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date registeredDate;
    }
    
    final int MEMBER_SIZE = 100;
    Member[] members = new Member[MEMBER_SIZE];
    int memberCount = 0;
    
    class Board{
      int no;
      String title;
      Date date;
      int viewCount;
    }
    
    final int BOARD_SIZE = 100;
    Board[] boards = new board[BOARD_SIZE];
    int boardCout = 0;
    

    String command;
    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      
      switch (command) {
        case "/lesson/add":
          Lesson lseeon = new Lesson();
          
          System.out.print("번호? ");
          lseeon.no = keyboard.nextInt();
          
          keyboard.nextLine();

          System.out.print("수업명? ");
          lseeon.title = keyboard.nextLine();

          System.out.print("수업내용? ");
          lseeon.description = keyboard.nextLine();

          System.out.print("시작일? ");
          lseeon.StartData = Date.valueOf(keyboard.next());

          System.out.print("종료일? ");
          lseeon.EndData = Date.valueOf(keyboard.next());

          System.out.print("총수업시간? ");
          lseeon.TotalHours = keyboard.nextInt();
          keyboard.nextLine();

          System.out.print("일수업시간? ");
          lseeon.dayHours = keyboard.nextInt();
          keyboard.nextLine(); 
          
          
         
          lessons[lsesonCount++] = lseeon;
          System.out.println("저장하였습니다.");
          
          break;
        case "/leeson/list" :
          for (int i = 0; i < lsesonCount++; i++) { 
            Lesson l = lessons[i];
            System.out.printf("%d, %s, %s ~ %s, %d\n",
                l.no, l.title, l.startDate, l.endDate, l.totalHours);
          }
          break;
        case "/member/add" :
          Member member = new Member();

          System.out.print("번호? ");
          member.no = keyboard.nextInt();
          keyboard.nextLine();

          System.out.print("이름? ");
          member.name = keyboard.nextLine();

          System.out.print("이메일? ");
          member.email = keyboard.nextLine();

          System.out.print("암호? ");
          member.password = keyboard.nextLine();

          System.out.print("사진? ");
          member.photo = keyboard.nextLine();

          System.out.print("전화? ");
          member.tel = keyboard.nextLine();

          member.registereData = new Date(System.currentTimeMillis());

           members[mamberCount++] = member;
           System.out.println("저장하였습니다.");
           
           break;
        case "/member/list" :
          for (int i = 0; i < MemberCount; i++) {  
            Member m = members[i];
            System.out.printf("%d, %s, %s, %s, %s\n",
                m.no, m.name, m.email, 
                m.tel ,m.registereData);
    }
          break;
        case "board/add":
          Board board = new Board();

          System.out.print("번호? ");
          board.no = keyboard.nextInt();
          keyboard.nextLine(); // 줄바꿈 기호 제거용

          System.out.print("내용? ");
          board.title = keyboard.nextLine();

          board.date = new Date(System.currentTimeMillis());
          board.viewCount = 0;
          
          boards[boardCount++] = board;
          System.out.println("저장하였습니다.");
          
          break;
        case "/board/list:"
        for (int i = 0; i < boardcount; i++) { // 반복문 
          Board b = boards[i];
          System.out.printf("%d, %s, %s, %d\n", 
              b.no, b.title, b.date, b.viewCount);
        }
        break;
        default;
        if (!command.equalsIgnoreCase("quit")) {
          System.out.println("실행할 수 없는 명령입니다.");}
    }
  } while (!command.equalsIgnoreCase("quit"));
  System.out.println("안녕!");

  keyboard.close();
}
}

    
    
