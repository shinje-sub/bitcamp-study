package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberAddServlet implements Servlet {

  // DAO 클래스를 구체적으로 지정하기 보다는
  // 인터페이스를 지정함으로써
  // 향후 다른 구현체로 교체하기 쉽도록 한다.
  //
  MemberDao memberDao;

  public MemberAddServlet(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {
    Member member = new Member();

    out.println("이름? ");
    out.println("!{}!");
    out.flush();
    member.setName(in.nextLine());

    out.println("이메일? ");
    out.println("!{}!");
    out.flush();
    member.setEmail(in.nextLine());

    out.println("암호? ");
    out.println("!{}!");
    out.flush();
    member.setPassword(in.nextLine());

    out.println("사진? ");
    out.println("!{}!");
    out.flush();
    member.setPhoto(in.nextLine());

    out.println("전화? ");
    out.println("!{}!");
    out.flush();
    member.setTel(in.nextLine());

    if (memberDao.insert(member) > 0) {
      out.println("회원을 저장했습니다.");

    } else {
      out.println("저장에 실패했습니다.");
    }
  }
}
