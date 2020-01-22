package com.eomcs.lms.handler;

import java.util.Iterator;
import java.util.List;
import com.eomcs.lms.domain.Member;

// "/member/list" 커멘드 실행
public class MemberListCommand implements Command {

  List<Member> memberList;


  public MemberListCommand(List<Member> list) {
    this.memberList = list;
  }

  @Override
  public void execute() {

    Iterator<Member> iterator = memberList.iterator();

    while (iterator.hasNext()) {

      Member m = iterator.next();

      System.out.printf("%d, %s, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel(),
          m.getRegisteredDate());
    }
  }
}
