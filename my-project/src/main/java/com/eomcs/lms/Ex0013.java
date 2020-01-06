// 클래스
// 객체지향에서는 모든걸 객체로 표현할수 있어야 한다.
// 데이터 필드와 메서드 (클래스)
// 생성자도 메소드이다.
// this는 자기자신의 주소를 가지고 있다. 특별한 변수이다.
//  this = 생성된 인스턴스 자신의 주소를 가리킴;


package com.eomcs.lms;

public class Ex0013 {

  public static void main(String[] args) {
    Person3 p1 = new Person3("shs", "201212"); // p 라는 인스턴스 
    p1.printInfo();
    System.out.println(p1.printInfo());
    System.out.println(Person3.getNationality());
  }
}
class Person3 {
  private static final String nationality = "KOR";
  private String name;
  private String pNum;
  private String mail;
  
  public Person3() {

  }
  public Person3(String name, String pNum) {
    this();
    this.name = name;
    this.pNum = pNum;
  }
public Person3(String name, String pNum, String mail) {
  this(name, pNum);
  this.mail = mail;
}
  public static String getNationality() {
    return Person3.nationality; // 게터
  }
  public String printInfo() { // 참조형 반환타입
    String res = "";
    res += String.format("이름 : %s\n", this.name);
    res += String.format("주민번호 : %s\n", this.pNum);
    return res;
  }
  /*public void printInfo() {
    System.out.printf("이름 : %s\n", this.name);
    System.out.printf("주민번호 : %s\n", this.pNum);
  }*/

  public void sleep() {

  }
}
