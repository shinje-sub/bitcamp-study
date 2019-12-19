package com.eomcs.basic.ex05;

// 비트 이동 연산자 : >>, >>>, <<
//
public class Exam04_1 {
  public static void main(String[] args) {
    // << 비트 이동 연산자 사용법
    //
    // 왼쪽 이동
    // - 1비트 이동은 곱하기 2 한 것과 같은 효과를 준다.
    // - 값을 배수로 증가시킬 때 곱하기 연산 보다 
    //   비트 이동 연산이 빠르기 때문에
    //   실무에서는 이 비트 이동 연산을 자주 사용한다.
    // 
    int i = 1;
    //         00000000 00000000 00000000 00000000 = 1
    System.out.println(i << 1);
    //       0|00000000 00000000 00000000 00000001x
    //         00000000 00000000 00000000 000000010 = 2
    System.out.println(i << 2);
    //      00|00000000 00000000 00000000 0000001xx
    //         00000000 00000000 00000000 000000100 = 4
    System.out.println(i << 3);
    //     000|00000000 00000000 00000000 000001xxx
    //         00000000 00000000 00000000 000001000 = 8
    System.out.println(i << 4);
    //     0000|00000000 00000000 00000000 00001xxx
    //          00000000 00000000 00000000 00010000 = 16
    // 왼쪽으로 이동 후, 
    // 오른 쪽 빈자리 : 0으로 채운다.
    // 왼쪽 경계를 넘어간 비트 : 짜른다.

    i = 0b0000_1011; // 11
    System.out.println(i << 1); // 22 => 0001011x => 00010110 => 22
    System.out.println(i << 2); // 44 => 001011xx => 00101100 => 44
    System.out.println(i << 3); // 88 => 01011xxx => 01011000 => 88
  }
}
