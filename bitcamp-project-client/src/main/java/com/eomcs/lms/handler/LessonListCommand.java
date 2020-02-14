// "/lesson/list" 커멘드 사용
package com.eomcs.lms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.eomcs.lms.proxy.LessonDaoProxy;

public class LessonListCommand implements Command {

  LessonDaoProxy lessonDao;


  public LessonListCommand(LessonDaoProxy lessonDao) {
    this.lessonDao = lessonDao;
  }

  @Override
  public void execute() {
    try {

      // List<Lesson> lessons = lessonDao.findAll();

      // JDBC(MariaDB 프록시)를 로딩한다.
      Class.forName("org.mariadb.jdbc.Driver");

      // JDBC Driver를 이용하여 MariaDB에 접속한다.
      Connection con =
          DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb", "study", "1111");

      // MariaDB에 명령을 전달할 객체 준비
      Statement stmt = con.createStatement();

      // MariaDB의 lms_board 테이블에 있는 데이터를 가져올 도구를 준비
      ResultSet rs = stmt.executeQuery(
          "select lesson_id, sdt, edt, tot_hr, day_hr, titl, conts " + "from lms_lesson");

      // ResultSet 도구를 사용하여 데이터를 하나씩 가져온다.
      while (rs.next()) { // 데이터를 한 개 가져 왔으면 true를 리턴한다.
        System.out.printf("%d, %s, %s, %d, %d, %s, %s, %s\n", rs.getInt("lesson_id"),
            rs.getDate("sdt"), rs.getDate("edt"), rs.getInt("tot_hr"), rs.getInt("day_hr"),
            rs.getString("titl"), rs.getString("conts"));
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e) {
      System.out.println("목록 조회 실패!!");
    }
  }

}
