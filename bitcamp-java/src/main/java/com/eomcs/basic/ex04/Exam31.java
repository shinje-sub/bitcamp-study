package com.eomcs.basic.ex04;

public class Exam31 {
  public static void main(String[] args){
    // 부동소수점 변수 - 메모리 크기
    float f;
    
    f = 3.141592f;
    System.out.println(f);  
  
    f = 3.1415927f;
    System.out.println(f);

    //f = 3.1415929f//컴파일 오류!
    //System.out.println(f);

    f = 0.0000003141592f;
    System.out.println(f); // 3.141592E-7 결과값 3.141592 10 - ^ 7
                           // 앞에 있는 0은 자릿수 x

    f = 0.00000031415929f; // 소수점 이하인 경우 앞의 0은 제거 유효자릿수에 포함 안함
    System.out.println(f);
      
    f = 314159200000.0f;
    System.out.println(f); // 소수점 이상인 경우 뒤의 0을 포함해서 유효자릿수 계산

    double d;
    d = 9.87654321234567;
    System.out.println(d);

    d = 98765432.1234567;
    System.out.println(d);

    d = 98765432123456.7;
    System.out.println(d);

    d = 98765432123456.74; // 값이 왜곡된다.
    System.out.println(d);

    // 변수와 리터럴
    f = 99999.99f;
    System.out.println(f);

    f = 99999.88777f; // 이미 리터럴이 4바이트 유효자릿수를 넘어갔다.
    System.out.println(f);

    d = 99999.88f; // 부동소수점 4바이트 메모리
    System.out.println(d);
    
    d = 99999.88; // 부동소수점 8바이트 메모리
    System.out.println(d);
    System.out.println();
    
    float f1 = 99988.88f; // 유효 자릿수 범위 내 정확히 나옴
    float f2 = 11.11111f; // 유효 자릿수 범위 내 정확히 나옴
    System.out.println(f1);
    System.out.println(f2);

    float f3 = f1 + f2;
    System.out.println(f3);
    // 99988.88
    //    11.11111
    //----------------
    // 99999.99111
    


    double r = f1 + f2; // float + float = float 이미 결과에서 값이 왜곡된다.
    System.out.println(r);
    
    double d1 = 99988.88;
    double d2 = 11.11111;
    System.out.println(d1);
    System.out.println(d2);
    
    double d3 = d1 + d2;
    System.out.println(d3); // 정확한 값이 나온다. 
    //결론은 부동소수점은 double을 사용한다.
    
    f1 = 3.141592f;
    d1 = f1; // 컴파일 ok 단, 값은 왜곡 될수 있다.
    System.out.println(d1);
    
    //f1 = d1; // 컴파일 오류!

    //값이 계산하지 않는경우 float 값을 계산하는경우는 double 사용해야한다.
  }
}
    
  