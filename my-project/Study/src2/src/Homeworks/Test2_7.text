package Homeworks;

import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {
    //최대값 최소값을 구할 int배열
    Scanner keyScan = new Scanner(System.in);

    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE ;

    System.out.println("입력? ");
     while (true) {
       int no = keyScan.nextInt();
       if (no == 0) // 입력값으로 0을 사용할 수 없는 문제가 있다.
         break;
    min = no < min ? no : min;
    max = no > max ? no : max;
     }
    System.out.printf("최대값: %d\n", max);
    System.out.printf("최소값: %d\n", min);
    keyScan.close();
  }
  }










