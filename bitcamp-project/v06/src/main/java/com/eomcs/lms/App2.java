package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class App2 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    final int SIZE = 100;
    int[] no = new int[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
   
    String[] password = new String[SIZE];
    String[] photo = new String[SIZE];
    Date[] registereData = new Date[SIZE];
    String[] tel = new String[SIZE];



    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      count++;

      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();
    
      System.out.print("이름? ");
      name[i] = keyboard.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();

      System.out.print("암호? ");
      password[i] = keyboard.nextLine();

      System.out.print("사진? ");
      photo[i] = keyboard.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboard.nextLine();

      registereData[i] = new Date(System.currentTimeMillis());
      
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response;
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
    }
      
}
    keyboard.close();
    
    System.out.println();
    
    for (int i = 0; i < count; i++) {  
      System.out.printf("%d, %s, %s , %s\n",
          no[i], name[i], email[i], 
          tel[i] ,registereData[i]);
    }
  }
}