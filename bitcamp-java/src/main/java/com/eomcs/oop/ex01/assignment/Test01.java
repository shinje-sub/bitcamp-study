package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01 {
  static Scanner KeyScan = new Scanner (System.in);
  public static void main (String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int math;
    }

    Score[] arr = new Score[3];


    for (int i = 0; i < arr.length; i++) {
      System.out.print("입력: ");
      Score s = new Score();

      s.name = KeyScan.next();
      s.kor = KeyScan.nextInt();
      s.eng = KeyScan.nextInt();
      s.math = KeyScan.nextInt();

      arr[i] = s;
    }

    KeyScan.close();

    System.out.println("-------------------------");

    for (int i =0; i < arr.length; i++) {
      Score s = arr[i];
      int sum = s.kor + s.eng + s.math;
      float aver = sum / 3f;
      System.out.printf("%s %d %d %d %.1f\n", s.name, s.kor, s.math, s.eng, sum, aver);
    }
  }
}

