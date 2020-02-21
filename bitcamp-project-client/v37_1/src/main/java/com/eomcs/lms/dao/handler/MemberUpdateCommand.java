package com.eomcs.lms.dao.handler;

import com.eomcs.lms.dao.domain.Member;
import com.eomcs.lms.dao.domain.MemberDao;
import com.eomcs.lms.dao.util.Prompt;

public class MemberUpdateCommand implements Command {

  Prompt prompt;
  MemberDao memberDao;

  public MemberUpdateCommand(MemberDao memberDao, Prompt prompt) {
    this.memberDao = memberDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호? ");

      Member oldMember = null;
      try {

        oldMember = memberDao.findByNo(no);
      } catch (Exception e) {
        System.out.println("해당 번호의 회원을 찾을 수 없습니다.");
        return;
      }

      Member newMember = new Member();

      newMember.setNo(oldMember.getNo());

      newMember.setName(
          prompt.inputString(String.format("이름(%s)? ", oldMember.getName()), oldMember.getName()));

      newMember.setEmail(prompt.inputString(String.format("이메일(%s)? ", oldMember.getEmail()),
          oldMember.getEmail()));

      newMember.setPassword(prompt.inputString(String.format("암호(%s)? ", oldMember.getPassword()),
          oldMember.getPassword()));

      newMember.setPhoto(prompt.inputString(String.format("사진(%s)? ", oldMember.getPhoto()),
          oldMember.getPhoto()));

      newMember.setTel(
          prompt.inputString(String.format("전화(%s)? ", oldMember.getTel()), oldMember.getTel()));

      if (newMember.getName().equals(oldMember.getName())) {
        System.out.println("게시물 변경을 취소하였습니다.");
        return;
      }

      memberDao.update(newMember);
      System.out.println("회원을 변경했습니다.");

    } catch (Exception e) {
      System.out.println("변경 실패!");
    }
  }
}
