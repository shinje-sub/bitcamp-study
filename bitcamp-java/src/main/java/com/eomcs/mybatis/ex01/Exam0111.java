// Data Persistence Framework 도입 - 좀더 쉽게 Mybatis 설정 파일의 InputStream 얻는 방법
package com.eomcs.mybatis.ex01;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0111 {

  public static void main(String[] args) throws Exception {
    // mybatis 설정 파일을 읽을 InputStream 도구를 준비한다.
    // 1 직업 파일 시스템 경로를 지정하기
    // => 다음과 같이 mybatis 설정 파일의 경로를 직접 지정하면
    // 애플리케이션 배포 경로가 바뀔 때 마다
    // 소스를 변경하고 다시 컴파일 해야 하는 문제가 있다.
    // InputStream mybatisConfigInputStream = new FileInputStream(//
    // "./bin/main/com/eomcs/mybatis/ex01/mybatis-config.xml");

    // => 이를 간편하게 하기 위해 Mybatis는 도우미 객체를 제공한다.
    // => Resources 클래스의 메서드를 이용하면
    // 자바 클래스가 있는 패키지 폴더에서 mybatis 설정파일을 찾을 수 있다.
    InputStream mybatisConfigInputStream = //
        Resources.getResourceAsStream(//
            "com/eomcs/mybatis/ex01/mybatis-config.xml");


    SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

    SqlSessionFactory factory = factoryBuilder.build(mybatisConfigInputStream);

    SqlSession sqlSession = factory.openSession();

    System.out.println("mybatis 준비 완료!");

    sqlSession.close();
  }

}


