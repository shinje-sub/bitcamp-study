package com.eomcs.lms.servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.dao.MemberFileDao;
import com.eomcs.lms.domain.Member;

public class MemberUpdateServlet implements Servlet {

  MemberFileDao memberDao;

  public MemberUpdateServlet(MemberFileDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {

    Member member = (Member) in.readObject();

    if (memberDao.update(member) > 0) {
      out.writeUTF("Ok");
    } else {
      out.writeUTF("FAIL");
      out.writeUTF("해당 번호의 게시물이 없습니다.");
    }

  }
}
