package com.eomcs.oop.ex03.test;

public class Engine {
  int sylinder; 
  int valve;
  int cc;
  int oilState;
  
  public Engine (int syleiner, int valve, int cc) {
    this.sylinder = syleiner;
    this.valve = valve;
    this.cc = cc;
    this.oilState = 0;
  }
  
  void cleanOil() {
    this.oilState = 10;
  }
}
