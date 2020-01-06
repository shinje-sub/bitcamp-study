package com.eomcs.lms;

// 상속

public class Ex0017 {

  public static void main(String[] args) {
    
    // Person 타입의 레퍼런스 변수에 Person, Student, Professor 형태의 인스턴스 주소 할당
    Person[] p = new Person[3];
    p[0] = new Person("000000-1111111", "일반인", 25, "일반인@naver.com");
    p[1] = new Student("111111-2222222", "학생1", 23, "학생1@gmail.com", "s20112000", "학생1@university.ac.kr");
    p[2] = new Professor("222222-3333333", "교수1", 40, "교수1@gmail.com", "p1001", "교수1@university.ac.kr");
    
    // 정보 출력
    // 모두 각각의 인스턴스 형태에 맞게 toString() 메소드가 호출됨
    for(int i = 0; i < p.length; i++)
      System.out.println(p[i]);
    
    
    // greet 메소드 호출 결과
    // p[1]과 p[2]는 각각 학생과 교수인데 자신의 메소드를 사용 불가
    // 이유는 레퍼런스 타입이 Person이기 때문
    
    p[0].greetOfPerson();
    //p[1].greetOfStudent();   // error
    //p[2].greetOfProfessor(); // error
    
    
    // 위와 다르게 Person 클래스의 메소드는 전부 사용 가능, 즉 부모 클래스의 메소드 사용 가능하며 레퍼런스 타입 유의해야함
    p[1].greetOfPerson();
    p[2].greetOfPerson();
    System.out.println("---------------------------------------------");
    
    // instanceof 연산자 통해서 해당 객체가 실제로 주어진 클래스의 인스턴스인지 판단 후 맞으면 형변환해서 자신의 메소드 호출
    for(int i = 0; i < p.length; i++) {      
      if(p[i] instanceof Student) {
        Student tmp = (Student)p[i];
        tmp.greetOfStudent();      
      }
      else if(p[i] instanceof Professor) {
        Professor tmp = (Professor)p[i];
        tmp.greetOfProfessor();
      }
      else
        p[i].greetOfPerson();
    }     
  }
}

class Person {
  protected String personID;
  protected String name;
  protected int age;
  protected String privateMail;
  
  protected Person(String personID, String name, int age, String privateMail) {
    this.personID = personID;
    this.name = name;
    this.age = age;
    this.privateMail = privateMail;
  }
  public void greetOfPerson() {
    System.out.println("사람 : 안녕하세요.");
  }
  public String toString() {
    String res = "";
    res += String.format("이름 : %s\n",  name);
    res += String.format("나이 : %d\n",  age);
    res += String.format("메일 : %s\n",  privateMail);
    return res;
  }
}

class Student extends Person {
  private String studentID;
  private String univMail;
  
  public Student(String personID, String name, int age, String privateMail, String studentID, String univMail) {
    super(personID, name, age, privateMail);
    this.studentID = studentID;
    this.univMail = univMail;
  }
  
  public void greetOfStudent() {
    System.out.println("학생 : 안녕하세요.");
  }
  
  public String toString() {
    String res = super.toString();
    res += String.format("학번 : %s\n",  studentID);
    res += String.format("학교 메일 : %s\n",  univMail);
    return res;
  }
}

class Professor extends Person {
  private String professorID;
  private String univMail;
  
  public Professor(String personID, String name, int age, String privateMail, String professorID, String univMail) {
    super(personID, name, age, privateMail);
    this.professorID = professorID;
    this.univMail = univMail;
  }
  
  public void greetOfProfessor() {
    System.out.println("교수 : 안녕하세요.");
  }
  
  public String toString() {
    String res = super.toString();
    res += String.format("교직원번호 : %s\n",  professorID);
    res += String.format("학교 메일 : %s\n",  univMail);
    return res;
  }
}