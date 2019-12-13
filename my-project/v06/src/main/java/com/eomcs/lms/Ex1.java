package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

public class Ex1 {
  // 주차장 입차 출차 시스템

  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    
    int[] no = new int[100];
    String[] CarType = new String[100];
    String[] CarNumber = new String[100];
    String[] parking = new String[100];
    Date[] date = new Date[100];
    String[] Departure = new String[100];
    //String[] EnteringAvehicle = new String[100];
    String response;
    
    int count = 0;
    for (int i = 0; i < 100; i++) {
      System.out.printf("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.printf("차종? ");
      CarType[i] = keyboard.nextLine();
      
      System.out.printf("차량번호? ");
      CarNumber[i] = keyboard.nextLine();
      
      System.out.printf("차량 위치? ");
      parking[i] = keyboard.nextLine();
      
      //System.out.printf("차량 입차 날짜? ");
     
      date[i] = new Date(System.currentTimeMillis());
    
     
      System.out.printf("차량 출차 날짜? ");
      Departure[i] = keyboard.nextLine();
     
      count ++;
      
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
      System.out.printf("번호:%s, 차종:%s\n차량 번호 :%s, 차량 위치:%s\n입차 날짜:%s,출차날짜:%s\n",
          no[i], CarType[i], CarNumber[i], parking[i], 
           Departure[i],date[i],Departure[i]);
    }
    
    
    
    
    
    
    
    
  }
}
