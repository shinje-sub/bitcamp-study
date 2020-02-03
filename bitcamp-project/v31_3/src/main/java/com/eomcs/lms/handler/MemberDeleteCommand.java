package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.Prompt;

// "/member/delete" 커멘드 실행
public class MemberDeleteCommand implements Command {

  List<Member> memberList;

  Prompt prompt;

  public MemberDeleteCommand(Prompt prompt, List<Member> list) {
    this.prompt = prompt;
    this.memberList = list;
  }

  @Override
  public void execute() {
    int index = indexOfMember(prompt.inputInt("번호? "));


    if (index == -1) {
      System.out.println("해당 회원을 찾을 수 없습니다.");
      return;
    }

    this.memberList.remove(index);

    System.out.println("회원을 삭제했습니다.");
  }

  private int indexOfMember(int no) {
    for (int i = 0; i < this.memberList.size(); i++) {
      if (this.memberList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
