package com.eomcs.oop.ex03.test;

public class Car {

  boolean on;
  int speed;
  String nema;
  String maker;
  Engine engine;
  int distance;
  
  Car() {
    this.engine = new Engine(4, 16, 1980); //Car 생성자는 유효한 값들로 적절하게 생성해주는것.
  }

  void start() {
    this.on = true;
  }

  void stop() {
    this.on = false;
  }
  void check() {
   if (this.engine.oilState == 0) {
     this.engine.cleanOil();
     System.out.println("자동차의 엔진 오일을 교환했습니다!");
   }
   System.out.println("자동차를 정비했습니다!");
  }
  
 }

