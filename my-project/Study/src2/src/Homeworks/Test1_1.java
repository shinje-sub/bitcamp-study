package Homeworks;

import java.util.Scanner;

//# 과제1 : 입력 받은 두 정수 사이의 합계를 구하라.
//실행 예)
//입력? 2 5
//2에서 5까지 합은 14 입니다.

public class Test1_1 {
  
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in); // 키보드 열기
   
   System.out.print("입력? ");
   int start = keyScan.nextInt();
   int end = keyScan.nextInt();
   
   int sum = 0;
   for (int no = start; no<= end; no++ ) {
   
     sum += no;
   }
   // 2 + 3 + 4 + 5 + 6 + 7  = 27
   
    
   
   System.out.printf("%d에서 %d까지의 합은 %d입니다.\n", start, end, sum);
  
   keyScan.close(); // 키보드 닫기
   // 결과 피드백을 바탕으로 코드 수정
   // => 초기 입력 값이 변경되는 문제
  }
}
   
   

