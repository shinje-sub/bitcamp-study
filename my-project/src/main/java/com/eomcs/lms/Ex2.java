package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;
public class Ex2 {

  public static void main (String[]avgs) {
    Scanner keyboard = new Scanner(System.in);
   
    int[] no = new int[100];
    String[] Cartype = new String[100];
    String[] CarNumbel = new String[100];
    String[] photo = new String[100];
    String[] DiscountRatr = new String[100];
    String[] Payment = new String[100];
    String[] GyeoljeYuhyeong = new String[100];
    String[] parking = new String[100];
    String[] ExitStatus = new String[100];
    String[] acceptance = new String[100];
    String response;
    
    int count = 0;
    for (int i = 0; i < 100; i++) {
      System.out.printf("번호 ?: ");
      no[i] = keyboard.nextInt();
     
      
      System.out.printf("차종?: ");
      Cartype[i] = keyboard.nextLine();
      keyboard.nextLine();
     
      System.out.printf("차량 번호?: ");
      CarNumbel[i] = keyboard.nextLine();
      
      System.out.printf("사진?: ");
      photo[i] = keyboard.nextLine();
      
      System.out.printf("할인률?: ");
      DiscountRatr[i] = keyboard.nextLine();
     
      System.out.printf("결제 금액?: ");
      Payment[i] = keyboard.nextLine();
      
      System.out.printf("결제 유형?: ");
      GyeoljeYuhyeong[i] = keyboard.nextLine();

      System.out.print("차량 주차 장소?: ");
      parking[i] = keyboard.nextLine();
    
      System.out.print("입·출차 상태?: ");
      ExitStatus[i] = keyboard.nextLine();
    
      System.out.print("수납 구분?: ");
      acceptance[i] = keyboard.nextLine();
    
      count ++;
      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyboard.close();
    for (int i = 0; i < count; i++) {
      System.out.printf("번호:%s, 차종:%s\n차량 번호 :%s, 차량 위치:%s\n입차 날짜:%s,출차날짜:%s\n",
          no[i], Cartype[i], CarNumbel[i], photo[i], 
          DiscountRatr[i],Payment[i],GyeoljeYuhyeong[i],
              parking[i],ExitStatus[i],acceptance[i]);
    }
  }
}

