// "/member/list" 커멘드 실행
package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.proxy.MemberDaoProxy;

public class MemberListCommand implements Command {

  MemberDaoProxy memberDao;

  public MemberListCommand(MemberDaoProxy memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void execute() {
    try {

      List<Member> members = memberDao.findAll();
      for (Member m : members) {
        System.out.printf("%d, %s, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel(),
            m.getRegisteredDate());
      }


    } catch (Exception e) {
      System.out.println("조회 실패!");
    }
  }
}
