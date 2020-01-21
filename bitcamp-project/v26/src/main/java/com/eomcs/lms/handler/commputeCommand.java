package com.eomcs.lms.handler;

import com.eomcs.lms.util.Prompt;

// "/hello/detail" 명령 처리
public class commputeCommand implements Command {

  Prompt prompt;

  public commputeCommand(Prompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    int plus = prompt.inputInt("수1? ");

    int plus1 = prompt.inputInt("수2? ");

    System.out.printf("계산결과는 %s입니다.\n", plus + plus1);
    return;
  }
}
