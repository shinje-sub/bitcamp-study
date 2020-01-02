package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {

  static final int DEFAULT_CAPACITY = 3;

  Lesson[] list;

   int size;



  public LessonList() {
    this.list = new Lesson[DEFAULT_CAPACITY];
  }

  public LessonList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Lesson[DEFAULT_CAPACITY];
    else
      this.list = new Lesson[capacity];
  }
  public Lesson[] toArray() {
    /*
    Lesson[] arr = new Lesson[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    */
    Lesson[] arr = Arrays.copyOf(this.list,this.size);
    return arr;
  }

  public void add(Lesson lesson) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = lesson;
  }
}

