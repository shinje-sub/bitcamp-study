package com.eomcs.lms.dao.handler;

import com.eomcs.lms.dao.domain.Member;
import com.eomcs.lms.dao.domain.MemberDao;
import com.eomcs.lms.dao.util.Prompt;

// "/member/add" 커멘드 실행
public class MemberAddCommand implements Command {

  MemberDao memberDao;
  Prompt prompt;

  public MemberAddCommand(MemberDao memberDao, Prompt prompt) {
    this.memberDao = memberDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {

    Member member = new Member();

    member.setName(prompt.inputString("이름? "));
    member.setEmail(prompt.inputString("이메일? "));
    member.setPassword(prompt.inputString("암호? "));
    member.setPhoto(prompt.inputString("사진? "));
    member.setTel(prompt.inputString("전화? "));

    try {
      memberDao.insert(member);

      System.out.println("저장하였습니다.");
    } catch (Exception e) {
      System.out.println("저장 실패!");
    }
  }
}
