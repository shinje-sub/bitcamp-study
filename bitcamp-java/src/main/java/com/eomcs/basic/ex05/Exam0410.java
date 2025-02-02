package com.eomcs.basic.ex05;

// # 비트 이동 연산자 : >>, >>>, <<
//
public class Exam0410 {
  public static void main(String[] args) {
    // << 비트 이동 연산자 사용법
    // - 왼쪽으로 비트를 이동시킨다.
    // - 오른 쪽 빈자리는 0으로 채운다.
    // - 왼쪽 경계를 넘어간 비트는 짜른다.
    //
    int i = 1;
    // 00000000 00000000 00000000 00000001 = 1

    System.out.println(i << 1);
    // 0|00000000 00000000 00000000 0000001x
    // 00000000 00000000 00000000 00000010 = 2

    System.out.println(i << 2);
    // 00|00000000 00000000 00000000 000001xx
    // 00000000 00000000 00000000 00000100 = 4

    System.out.println(i << 3);
    // 000|00000000 00000000 00000000 00001xxx
    // 00000000 00000000 00000000 00001000 = 8

    System.out.println(i << 4);
    // 0000|00000000 00000000 00000000 0001xxxx
    // 00000000 00000000 00000000 00010000 = 16

    i = 0b0000_1011; // 11
    System.out.println(i << 1); // 0001011x => 00010110 => 22
    System.out.println(i << 2); // 001011xx => 00101100 => 44
    System.out.println(i << 3); // 01011xxx => 01011000 => 88

    // 왼쪽 이동
    // - 1비트 이동은 곱하기 2 한 것과 같은 효과를 준다 .
    // - 값을 배수로 증가시킬 때 곱하기 연산을 하는 것 보다
    // 왼쪽 비트 이동 연산을 하는 것이 빠르기 때문에
    // 실무에서는 이 비트 이동 연산을 자주 사용한다.
    //
  }
}

