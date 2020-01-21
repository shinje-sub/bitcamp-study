// 아규먼트에 람다(lambda) 활용
package com.eomcs.oop.ex12;

public class Exam0311 {

  static interface Player {
    void play();
  }

  static void testPlayer(Player player) {
    player.play();
  }

  public static void main(String[] args) {
    // 익명 클래스
    Player p1 = new Player() {
      @Override
      public void play() {
        System.out.println("실행!");

      }
    };
    testPlayer(p1);
  }
}


