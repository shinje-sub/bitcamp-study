// 람다(lambda) 문법
package com.eomcs.oop.ex12;

// 람다(lambda) 문법
public class Exam0410 {

  static interface Interest {
    double compute(int money);
  }

  static Interest getInterset(final double rate) {
    // 로컬 클래스
    class MyInterset implements Interest {
      double rate;

      public MyInterset(double rate) {
        this.rate = rate;
      }

      @Override
      public double compute(int money) {
        return money + (money * rate / 100);
      }
    }
    return new MyInterset(rate);
  }

  public static void main(String[] args) {
    Interest i1 = getInterset(1.5);
    System.out.println(i1.compute(10_0000_0000));
  }
}


