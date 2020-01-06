package com.eomcs.lms;

public class Ex0015 {
  public static void main(String[] args) {
    MyMath1<Integer> m = new MyMath1<>(1, 2);
    MyMath1<String> m2 = new MyMath1<>("ABC", "DDD");
    System.out.println(m.getNum());
    System.out.println(m2.getNum());
  }
}

class MyMath1 <T> {
  T num1;
  T num2;
  public MyMath1(T num1, T num2) {
    this.num1 = num1;
    this.num2 = num2;
  }
  public T getNum() {
    return this.num1;
  }
}
