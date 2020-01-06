// break 문
package com.eomcs.lms;

public class Ex0004 {

  public static void main(String[] args) {

   for(int i = 0; i < 9; i++) {
     for(int j = 0; j < 9; j++) {
       System.out.printf("%d : %d\n", i, j);
       if(i > 5)
         break; // break문은 가장 가까운 반복문 탈출
     }
   }
}
}
