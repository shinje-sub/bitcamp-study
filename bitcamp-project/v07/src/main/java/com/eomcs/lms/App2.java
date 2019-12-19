package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class App2 {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    class Member{
      int no;
      String name;
      String email;
      String photo;
      Date registereData;
      String password;
      String tel;
    }

    final int SIZE = 100;

    Member[] members = new Member[SIZE];
    
  
    int count = 0;
    
    for (int i = 0; i < SIZE; i++) {
     

      // 회원정보를 저장할 메모리를 Member 설계도에 따라 만든다.
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

       members[i] = member;
       
       count++;

      System.out.println();
      
      //회원 정보가 담겨있는 인스턴스의 주소를 레퍼런스 배열에 보관한다.
      members[i] = member;
      

      String response;
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      keyboard.close();
    }

      System.out.println();


    for (int i = 0; i < count; i++) {  
      Member member = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          member.no, member.name, member.email, 
          member.tel ,member.registereData);
    }
  }
}