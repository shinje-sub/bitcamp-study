//# 과제 II
//사용자로부터 마름모의 가로 길이를 숫자를 입력 받아 '*' 문자로 그려라. 단 마름모의 절반만 그린다.


//## 구현 조건
//반복문을 사용할 때는 while 또는 do ~ while 문만을 사용하라!



package Homeworks;

import java.util.Scanner;

public class rhombus {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 숫자를 입력 받아 * 출력");
    int base = keyScan.nextInt();
    int x = 0;
    int enter;

    while(x < base) {
      enter = -1;
      while (enter < x) {
        System.out.printf("*");
        enter++ ;
      }
      System.out.println();
      x ++;
    }
    int y = 1;
    int enter2;
    while (y < base) {
      enter2 = base;
      while (enter2 > y) {
        System.out.print("*");
        enter2--;
      }
      System.out.println();
      y++;

    }

    keyScan.close();
  }   
}

