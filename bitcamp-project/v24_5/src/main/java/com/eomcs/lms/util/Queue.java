package com.eomcs.lms.util;

public class Queue<E> extends LinkedList<E> implements Cloneable {

  public void offer(E value) {
    this.add(value);
  }

  public E poll() {
    return this.remove(0);
  }


  @Override
  public Queue<E> clone() {
    Queue<E> temp = new Queue<E>();

    for (int i = 0; i < this.size(); i++) {
      temp.offer(this.get(i));
    }
    return temp;
  }
  public Iterator<E> iterator() {
    // this = 인스턴스 주소;

    // anonymous class: 인스턴스를 한 개만 생성할 경우 로컬 클래스를 익명 클래스로 정의하라.
    return new Iterator<E>() {


    // 인스턴스 블록 대신 변수 초기화 문법(variable initializer)으로 필드 값을 설정한다
    Queue<E> queue = (Queue<E>) Queue.this.clone();

    @Override
    public boolean hasNaxt() {
      return queue.size() > 0;
    }

    @Override
    public E next() {
      return queue.poll();
    }
  };
}

/*
 ## 클래스 맴버 :
    class 클래스{
      필드 선언 (스태틱, 인스턴스)
      초기화 블록(스태틱, 인스턴스)
      생성자
      메서드(스태틱, 인스턴스)
      중첩클래스(스태틱, 인스턴스)
     } 
 */
}