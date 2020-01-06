// break 문
package com.eomcs.lms;

public class Ex0005 {

  public static void main(String[] args) {

   for(int i = 0; i < 9; i++) {
     for(int j = 0; j < 9; j++) {
       if(i > 5)
         continue; // continue문은 반복문의 조건식으로 간다.
       System.out.printf("%d : %d\n", i, j);
     }
   }
}
}
