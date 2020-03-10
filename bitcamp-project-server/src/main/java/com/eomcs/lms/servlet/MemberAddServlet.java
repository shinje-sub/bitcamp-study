package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.Prompt;

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

    member.setName(Prompt.getString(in, out, "이름? "));

    member.setEmail(Prompt.getString(in, out, "이메일? "));

    member.setPassword(Prompt.getString(in, out, "암호? "));

    member.setPhoto(Prompt.getString(in, out, "사진? "));

    member.setTel(Prompt.getString(in, out, "전화? "));

    if (memberDao.insert(member) > 0) {
      out.println("회원을 저장했습니다.");

    } else {
      out.println("저장에 실패했습니다.");
    }
  }
}
