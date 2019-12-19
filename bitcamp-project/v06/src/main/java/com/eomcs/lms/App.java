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
     Date EndDate;
     int TotalHours;
     int dayHours;
    }
    
    final int SIZE = 100;

    int[] no = new int[SIZE];
    String[] title = new String[SIZE];
    String[] description = new String[SIZE];
    Date[] StartData = new Date[SIZE];
    Date[] EndData = new Date[SIZE];
    int[] TotalHours = new int[SIZE];
    int[] dayHours = new int[SIZE];

    int count = 0;

    for (int i =0; i < SIZE; i++) {
      count++;

      System.out.print("번호? ");
      no[i] = keyboard.nextInt();

      keyboard.nextLine();

      System.out.print("수업명? ");
      title[i] = keyboard.nextLine();

      System.out.print("수업내용? ");
      description[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      StartData[i] = Date.valueOf(keyboard.next());

      System.out.print("종료일? ");
      EndData[i] = Date.valueOf(keyboard.next());

      System.out.print("총수업시간? ");
      TotalHours[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("일수업시간? ");
      dayHours[i] = keyboard.nextInt();
      keyboard.nextLine(); // 일 수업시간 입력 값 다음에 남아 있는 줄바꿈 값 제거

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response;
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
      System.out.println();
     
      for (int i = 0; i < count; i++) {  
        System.out.printf("%d, %s,  %s ~ %s %d\n",
            no[i], title[i]  , StartData[i], 
            EndData[i],  TotalHours[i]);}
    }

  }
