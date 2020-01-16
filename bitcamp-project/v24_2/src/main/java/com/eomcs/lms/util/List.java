package com.eomcs.lms.util;


public interface List<E> {


  public abstract void add(int index, E value);

  public /*abstract*/ E get(int index);

  public abstract void add(E e);

  /*public*/ abstract E set(int index, E e);

  /*public abstract */E remove(int index);

  Object[] toArray();

  E[] toArray(E[] arr);

  int size();


  // 내부에 보관된 값을 꺼내주는 메서드를 추가한다.
  // => 값을 저장하는 방식에 따라 구현 방법이 다르기 때문에
  //    서브 클래스가 반드시 구현해야햐만 하는 추상 메서드이다.
  Iterator<E> iterator(); 


}

