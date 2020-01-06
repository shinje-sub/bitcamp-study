// 반복 if 문

package com.eomcs.lms;

public class Ex0001 {

  public static void main(String[] args) {

    int[] arr = new int [100];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
    
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] % 5 == 0) { // arr i = 5의 배수 판단
        if(arr[i] % 3 ==0) {
          System.out.println(arr[i]);

        }
      }
    }
  }
}
