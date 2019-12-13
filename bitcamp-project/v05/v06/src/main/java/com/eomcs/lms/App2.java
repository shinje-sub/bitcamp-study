package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;
public class App2 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int[] no = new int[100];
    String[] name = new String[100];
    String[] email = new String[100];
    Date[] date = new Date[100];
    int[] password = new int[100];
    String[] photo = new String[100];
    String[] tel = new String[100];
    String[] registereData = new String[100];
    String response;
    int[] viewCount = new int[100];
    
    
    int count = 0;
    for (int i = 0; i < 100; i++) {
      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      date[i] = new Date(System.currentTimeMillis());
      
      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();
      date[i] = new Date(System.currentTimeMillis());
      
      System.out.print("암호? ");
      password[i] = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("사진? ");
      photo[i] = keyboard.nextLine();
      
      System.out.print("전화? ");
      tel[i] = keyboard.nextLine();
   
      
      System.out.print("가입일? ");
      registereData[i] = keyboard.nextLine();
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
           System.out.printf("%s, %s, %s , %s %s %s \n",
               no[i], name[i], email[i], 
               photo[i], tel[i] ,date[i]);}
   }
 }

    
  
  


  
    
 