// 스레드 재사용 - 2단계) sleep()/timeout 을 활용한 스레드 재사용
package com.eomcs.concurrent.ex6;

import java.util.Scanner;

public class Exam0120 {
  public static void main(String[] args) {

    class MyThread extends Thread {
      int count;

      public void setCount(int count) {
        this.count = count;
      }

      @Override
      public void run() {
        System.out.println("스레드 시작했음!");
        try {
          // 스레드를 재사용하려면 다음과 같이 run() 메소드가 종료되지 않게 해야 한다.
          while (true) {
            // 카운트를 완료한 후 사용자가 다음 카운트 값을 입력할 시간을 주기 위해
            // 10초 정도 스레드를 멈춘다.
            Thread.sleep(10000);

            System.out.println("카운트 시작!");
            for (int i = count; i > 0; i--) {
              System.out.println("==> " + i);
              Thread.sleep(1000);
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }

    MyThread t = new MyThread();

    // 미리 스레드를 시작시켜 놓는다.
    t.start();

    Scanner keyScan = new Scanner(System.in);

    while (true) {
      System.out.print("카운트? ");
      String str = keyScan.nextLine();
      if (str.equals("quit")) {
        break;
      }

      int count = Integer.parseInt(str);
      t.setCount(count); // 스레드의 카운트 값을 변경한다.
      // sleep() 방식은
      // 일정 시간이 지난 후 스레드가 작업하게 만드는 방식이다.
      // 스레드가 잠든 사이에 작업할 내용을 변경해야 한다.
      // 그러면 스레드가 깨어나서 변경 사항에 따라 작업을 수행할 것이다.
      // 문제는,
      // => 스레드에 지정된 시간이 종료될 때까지 작업이 실행되지 않는다.
      // => 작업을 시키고 싶지 않아도 깨어나면 작업할 것이다.
    }
    System.out.println("main 스레드 종료!");
  }
}
