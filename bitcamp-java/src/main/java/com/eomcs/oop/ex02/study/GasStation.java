package com.eomcs.oop.ex02.study;

public class GasStation {

  
  int type;
  public String name;

  int refuel(Car c) {
    if (c.type != this.type)
      return 0;

    int amount = 100 - c.energy;
    c.energy = 100;
    return amount;
  }

  static void clean(Car c) { // 인스턴스 변수를 사용하지 않으면 static을 뺴지 않아도 된다.
    c.clenaLevel = 0;
  }
}
