package com.eomcs.oop.ex02.study;

public class Car {
  
  
  public static final int OIL = 1; // 중복 가능한거는 static변수로 만들어라
  public static final int GAS = 2; // 메서드 영역 area영역에 만들어짐
  
  String name; // 스태틱이 붙으면 한개의 정보만 가능
  int type;
  String color;
  int speed;
  int energy;
  int power;
  int clenaLevel;

  void speedUp() {
    // Car this = 메서드를 호출할 때 넘겨준 인스턴스 주소;
    if (this.speed >= 100) 
      return;
    this.speed += 10;
  }
  int commparePower(Car c) {
    if (this.power > c.power)
      return -1;
    else if (this.power == c.power)
      return 0;
    else
      return 1;
  }
}

