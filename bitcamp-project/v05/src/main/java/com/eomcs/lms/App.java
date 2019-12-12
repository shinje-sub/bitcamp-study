package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner; // 미리 지정하여 알려준다.

public class App {

  public static void main(String[] args) {
    
    // 키보드에서 사용자가 입력한 값을 읽어 문자열이나 정수 , 부동소수점 등으로 리턴하는 역활
    Scanner keyboard = new Scanner(System.in); // 입력 받을때 가장 많이 씀  사용할수 있는 곳을 붙혀줘야한다.
    
    System.out.print("번호? ");
    int no = keyboard.nextInt(); // 문자열을 담을 메모리 : 한줄을 작성할때까지 기다린후, 이라인에 보여준다(오른쪽 라인에 집어 넣어라)
   
    keyboard.nextLine(); // nextInt( 정수 값 다음에 있는 줄바꿈 기호를 제거한다.
    
    System.out.print("수업명? ");
    String title = keyboard.next();
    
    keyboard.nextLine(); 
    
    System.out.print("설명? ");
    String description = keyboard.nextLine();
    
    System.out.print("시작일? ");
    // "yyyy-MM-dd" 형대로 입력된 문자열을 날짜 정보로 바꾼다.
    Date StartData = Date.valueOf(keyboard.next());
    
    System.out.print("종료일? ");
    String EndData = keyboard.next();
    
    System.out.print("총수업시간? ");
    int totalHours = keyboard.nextInt();
    
    System.out.print("일수업시간? ");
    int dayHours = keyboard.nextInt();
    
    System.out.println();
    
    System.out.printf("번호: %d\n", no);
    System.out.printf("수업명: %s\n", title); //상자로 생각하여, 안에안에 들어가있다
    System.out.printf("설명: %s\n", description);
    System.out.printf("기간: %s ~ %s\n", StartData,EndData);
    System.out.printf("총수업시간: %d 시간\n", totalHours);
    System.out.printf("일수업시간: %d 시간\n", dayHours );
    
    keyboard.close(); // 사용한 선언을 종료해줘야 함
  }
}
