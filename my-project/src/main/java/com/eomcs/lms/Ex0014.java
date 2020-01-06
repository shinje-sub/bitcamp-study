// 오버로딩
//

package com.eomcs.lms;

public class Ex0014 {

  public static void main(String[] args) {
   MyMath.add(1, 2);
  }
}
class MyMath {
  public static void add(int a, int b) {
    System.out.println(a+b);
  }
  public static void add(double a, double b) {
    System.out.println(a+b);
  }
}