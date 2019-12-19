package com.eomcs.lms;

import java.util.Scanner; 
import java.sql.Date;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in); 

    // 강의 정보를 담을 메모리의 설계도를 만든다.
    // 클래스?
    // - 애플리케이션에서 다른 특정 데이터(수업정보, 학생정보,게시물, 제품정보 등)의 
    //   메모리 구조를 설계하는 문법이다.
    // - 이렇게 개발자가 새롭게 정의한 데이터 타입을
    //   "사용자 정의 데이터 타입"이라 부른다.
    // - 즉 '클래스'는 '사용자 정의 데이터 타입'을 만들 때 사용하는 문법이다.
    class Lesson{
      int no;
      String title;
      String description;
      Date StartData;
      Date EndData;
      int TotalHours;
      int dayHours;
    }

    final int SIZE = 100;
    
    Lesson[] lessons = new Lesson[SIZE];
    String response;
    int count = 0;
    
    for (int i =0; i < SIZE; i++) {
    
      
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
      keyboard.nextLine(); // 일 수업시간 입력 값 다음에 남아 있는 줄바꿈 값 제거
      
      
      //수업 정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
      // 래퍼런스 배열에 보관해 둔다.
      lessons[i] = lseeon;
      
      count++;
      
      System.out.println();
      
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
 }
      keyboard.close();
      
      System.out.println();
     
      for (int i = 0; i < count; i++) { 
        Lesson lseeon = lessons[i];
        System.out.printf("%d, %s, %s,  %s ~ %s %d\n",
            lseeon.no, lseeon.title, lseeon.description, lseeon.StartData, 
            lseeon.EndData, lseeon.TotalHours);
        }
    }
}
