package com.eomcs.lms.util;

import java.util.Arrays;

public class ArrayList2 {
  
  private static final int DEFAULT_CAPACITY = 10;
  
  Object[] elementData ;
  int size;

  public ArrayList2() {
    this.elementData = new Object[DEFAULT_CAPACITY]
  }
  public ArrayList2(int initilaCapacity) {
    this.elementData = new Object[initilaCapacity];
  }
}