package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberDetailServlet implements Servlet {

  // DAO 클래스를 구체적으로 지정하기 보다는
  // 인터페이스를 지정함으로써
  // 향후 다른 구현체로 교체하기 쉽도록 한다.
  //
  MemberDao memberDao;

  public MemberDetailServlet(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {
    out.println("번호? ");
    out.println("!{}!");
    out.flush();
    int no = Integer.parseInt(in.nextLine());

    Member member = memberDao.findByNo(no);

    if (member != null) {
      out.printf("번호: %s\n", member.getNo());
      out.printf("이름: %s\n", member.getName());
      out.printf("이메일: %s\n", member.getEmail());
      out.printf("암호: %s\n", member.getPassword());
      out.printf("사진: %s\n", member.getPhoto());
      out.printf("전화: %s\n", member.getTel());

    } else {

      out.println("해당 번호의 회원이 없습니다.");
    }
  }
}
