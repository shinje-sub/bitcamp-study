package com.eomcs.design_pattern.observer.after.h;

// 이전 버전에서는 인터페이스를 직접 구현했지만,
// (그래서 관심도 없는 carStopped() 메서드까지 정의했다)
// 이번 버전에서는 추상 클래스를 상속 받아 간접적으로 구현한다.
public interface CarObserver {
  // 자동차 시동을 켤 때 호출될 메서드
  void carStarted();

  // 자동차 시동을 끌 때 호출될 메서드
  void carStopped();
}
