package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.proxy.MemberDaoProxy;
import com.eomcs.lms.util.Prompt;

// "/member/add" 커멘드 실행
public class MemberAddCommand implements Command {

  MemberDaoProxy memberDao;
  Prompt prompt;

  public MemberAddCommand(MemberDaoProxy memberDao, Prompt prompt) {
    this.memberDao = memberDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {

    Member member = new Member();

    member.setNo(prompt.inputInt("번호? "));
    member.setName(prompt.inputString("이름? "));
    member.setEmail(prompt.inputString("이메일? "));
    member.setPassword(prompt.inputString("암호? "));
    member.setPhoto(prompt.inputString("사진? "));
    member.setTel(prompt.inputString("전화? "));
    member.setRegisteredDate(new Date(System.currentTimeMillis()));

    try {
      memberDao.insert(member);

      System.out.println("저장하였습니다.");
    } catch (Exception e) {
      System.out.println("저장 실패!");
    }
  }
}
