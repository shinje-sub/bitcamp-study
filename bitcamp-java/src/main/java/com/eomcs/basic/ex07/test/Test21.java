package com.eomcs.basic.ex07.test;

import com.eomcs.basic.ex07.test.Test21.Member;

// gym 회원 정보를 입력 받아 출력 한다.
public class Test21 {
  // 회원 정보를 담을 수 있는 메모리의 설계도
  static class Member {  // 식판 만들기
    int no;
    String name;
    int birthYear;
    char gender;
    float height;
    float weight;
    boolean personalTraining;
  }

  public static void main(String[] args) {

    // 인스턴스 주소 주고 받기

    // 1) 인스턴스 주소 받기
    Member m1;
    m1 = createMember();

    // 2) 인스턴스 주소 넘기기

    setMemberValuse(m1);

    printMember(m1);

  }
  static Member createMember() {
    Member m = new Member();
    return m;
  }

  static void setMemberValuse(Member m) {
    m.no = 100;
    m.name = "홍길동";
    m.birthYear = 2000;
  }

  static void printMember(Member m) /*파라미터라 부른다.*/ { 
  System.out.println(m.no);
  System.out.println(m.name);
  System.out.println(m.birthYear);
  }

}





