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
    // inner class: 특정 메서드 안에서만 사용되는 중첩 클래스라면 로컬 클래스로 정의하라.
    class QueueIterator<T> implements Iterator<T> {

      Queue<T> queue;

      @SuppressWarnings("unchecked")
      public QueueIterator()  {
        this.queue = (Queue<T>) Queue.this.clone();
      }
      @Override
      public boolean hasNaxt() {
        return queue.size() > 0;
      }

      @Override
      public T next() {
        return queue.poll();
      }
    }
    
    // 로컬 클래스의 인스턴스를 생성할 때 바깥 클래스의 인스턴스 주소를 줘서는 안된다.
    // 즉 생성자를 호출하는 앞쪽에 this를 붙여서는 안된다.
    return new QueueIterator<>();
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