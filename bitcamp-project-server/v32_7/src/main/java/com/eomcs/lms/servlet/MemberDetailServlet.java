package com.eomcs.lms.servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.dao.MemberFileDao;
import com.eomcs.lms.domain.Member;

public class MemberDetailServlet implements Servlet {

  MemberFileDao memberDao;

  public MemberDetailServlet(MemberFileDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {


    int no = in.readInt();

    Member member = memberDao.findByNo(no);

    if (member != null) {
      out.writeUTF("OK");
      out.writeObject(member);
    } else {
      out.writeUTF("FAIL");
      out.writeObject("해당 번호의 게시물이 없습니다.");
    }

  }
}
