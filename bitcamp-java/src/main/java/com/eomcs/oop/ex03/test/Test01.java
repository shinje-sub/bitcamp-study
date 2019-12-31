package com.eomcs.oop.ex03.test;

import com.eomcs.oop.ex03.test.sub.A;


class Score {
  static int count;

  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
 


  
  Score(String name, int kor, int eng, int math) { // 기본 생성자
    System.out.println("Score() - 2 ");
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
    Score.increas();
  }

  static void increas() {
    Score.count++;
  }


  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}
public class Test01 {

  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 90, 80); // 디폴트 생성자 - 메서드명이 클래스명이 같은 메서드
    System.out.println("-----------");
    

    Score s2 = new Score("임꺽정", 90, 80, 70);
    System.out.println("-----------");
   
  }
}
