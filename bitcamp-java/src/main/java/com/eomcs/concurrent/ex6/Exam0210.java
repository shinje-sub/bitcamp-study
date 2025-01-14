// 멀티 스레드 재사용
package com.eomcs.concurrent.ex6;

import java.util.ArrayList;
import java.util.Scanner;
import com.eomcs.concurrent.ex6.Exam0210.MyThread;
import com.eomcs.concurrent.ex6.Exam0210.ThreadPool;

public class Exam0210 {

  static class MyThread extends Thread {
    ThreadPool pool;
    int count;

    public MyThread(String name, ThreadPool pool) {
      super(name);
    }

    public void setCount(int count) {
      this.count = count;
      synchronized (this) {
        notify();
      }
    }

    @Override
    public void run() {
      synchronized (this) {
        try {
          while (true) {
            // 작업하라는 알림이 올 때 까지 기다린다.
            wait();

            // 알림이 오면 작업을 실행한다.
            for (int i = count; i > 0; i--) {
              System.out.printf("[%s] %d\n", getName(), i);
              Thread.sleep(2000);
            }
            // 스레드의 작업이 끝났으면 스레드풀로 돌아가야 한다.
            pool.add(this);
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
  interface ThreadPool {
    ThreadPool get();

    void add(ThreadPool obj);
  }

  static class MyThread implements ThreadPool {
    ArrayList<MyThread> list = new ArrayList<>();

    public MyThreadPool() {
      MyThread t1 = new MyThread("1번 스레드=>", this);
      t1.start();
      list.add(t1);

      MyThread t2 = new MyThread("2번 스레드***>", this);
      t2.start();
      list.add(t2);

      MyThread t3 = new MyThread("3번 스레드--->", this);
      t3.start();
      list.add(t3);
    }

    // 스레드 풀에서 한 개의 스레드를 꺼낸다.
    @Override
    public MyThread get() {
      if (list.size() > 0) {
        return list.remove(0);
      }
      return null;
    }

    // 스레드를 다 쓴 후에는 다시 스레드 풀에 돌려준다.
    public void add(Thread t) {
      list.add((MyThread) t);
    }

  }

  public static void main(String[] args) {



    // 스레드풀 준비!
    MyThreadPool threadPool = new MyThreadPool();

    Scanner keyScan = new Scanner(System.in);

    while (true) {
      System.out.print("카운트? ");
      String str = keyScan.nextLine();
      if (str.equals("quit")) {
        break;
      }

      int count = Integer.parseInt(str);

      // 스레드풀에서 스레드 한 개 꺼낸다.
      MyThread t = threadPool.get();
      if (t == null) {
        System.out.println("남는 스레드가 없습니다!");
        continue;
      }

      // 스레드의 카운터를 설정한다. 그러면 카운트를 시작할 것이다.
      t.setCount(count);
    }
    System.out.println("main 스레드 종료!");
    keyScan.close();
  }
}
