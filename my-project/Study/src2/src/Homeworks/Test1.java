package Homeworks;

import java.util.Scanner;

//# 과제1 : 입력 받은 두 정수 사이의 합계를 구하라.
// 실행 예)
// 입력? 2 5
// 출력? 2+3+4+5
// 2에서 5까지 합은 14 입니다.
public class Test1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("구하고 싶은 숫자의 합을 입력해주세요");
    int num1 = keyboard.nextInt();
    int num2 = keyboard.nextInt();

    int sum = 0;

    for (int i = num1; i<= num2; i++) {
      sum += i;
      System.out.println(sum);
    }
    System.out.printf("%d부터 %d까지의 합은 %d 입니다.\n", num1, num2, sum);
    keyboard.close();

  }
}
