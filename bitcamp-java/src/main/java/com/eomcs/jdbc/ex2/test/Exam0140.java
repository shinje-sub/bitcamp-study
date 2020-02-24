// 게시판 관리 - 변경
package com.eomcs.jdbc.ex2.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// 다음과 같이 게시물을 변경하는 프로그램을 작성하라!
// ----------------------------
// 번호? 1
// 제목? xxx
// 내용? xxxxx
// 변경하였습니다.
// (또는)
// 해당 번호의 게시물이 존재하지 않습니다.
// ----------------------------
public class Exam0140 {
  public static void main(String[] args) throws Exception {

    String no = null;
    String title = null;
    String contents = null;

    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.printf("번호? ");
      no = keyScan.nextLine();

      System.out.printf("제목? ");
      title = keyScan.nextLine();

      System.out.printf("내용? ");
      contents = keyScan.nextLine();
    }

    try (Connection con = DriverManager.getConnection(//
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(//
            "update x_board set title =?, contents=? where board_id = ?")) {

      stmt.setString(1, title);
      stmt.setString(2, contents);
      stmt.setString(3, no);
      int count = stmt.executeUpdate();

      if (count == 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.println("변경하였습니다.");
      }
    }

  }

}


