package com.eomcs.lms;

import java.util.Scanner; 
import java.sql.Date;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); 
    
    int[] no = new int[100];
    String[] title = new String[100];
    String[] description = new String[100];
    Date[] date = new Date[100];
    String[] StartData = new String[100];
    String[] EndData = new String[100];
    int[] TotalHours = new int[100];
    int[] dayHours = new int[100];
    int[] viewCount = new int[100];
    String response;
    
    int count = 0;
    for (int i =0; i < 100; i++) {
      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("수업명? ");
      title[i] = keyboard.nextLine();
      
      System.out.print("수업내용? ");
      description[i] = keyboard.nextLine();
      
      System.out.print("시작일? ");
      StartData[i] = keyboard.nextLine();
      
      System.out.print("종료일? ");
      EndData[i] = keyboard.nextLine();
      
      System.out.print("총수업시간? ");
      TotalHours[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("일수업시간? ");
      dayHours[i] = keyboard.nextInt();
      keyboard.nextLine();
      date[i] = new Date(System.currentTimeMillis());
      viewCount[i] = 0;
      
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
           System.out.printf("%s, %s,  %s ~ %s %s\n",
               no[i], title[i]  , StartData[i], 
               EndData[i],  TotalHours[i]);}
   }
 
  }

