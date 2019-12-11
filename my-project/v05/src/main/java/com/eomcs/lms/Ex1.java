package com.eomcs.lms;

import java.util.Scanner;

public class Ex1 {
  // 주차장 입차 주차 시스템

  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("번호?: ");
    String no = keyboard.nextLine();

    System.out.print("차종?: ");
    String CarType = keyboard.nextLine();

    System.out.print("차량번호?: ");
    String CarNumber = keyboard.nextLine();

    System.out.print("설명?: ");
    String Explanation = keyboard.nextLine();

    System.out.print("차량 위치?: ");
    String parking = keyboard.nextLine();

    System.out.print("차량 입차 시간?: ");
    String Entering = keyboard.nextLine();

    System.out.print("차량 출차 시간?: ");
    String Departure = keyboard.nextLine();

    System.out.println();

    System.out.printf("번호 : %s\n" , no); // 게시판 번호
    System.out.printf("차종 :%s\n ", CarType); 
    System.out.printf("차량 번호 :%s\n", CarNumber); 
    System.out.printf("설명 :%s\n ", Explanation);
    System.out.printf("차량 주차 위치 :%s\n" ,parking);
    System.out.printf("차량 입차 시간과 날짜 :%s\n", Entering);
    System.out.printf("차량 출차 시간과 날짜 :%s\n3", Departure);
    
    keyboard.close();
  }
}
