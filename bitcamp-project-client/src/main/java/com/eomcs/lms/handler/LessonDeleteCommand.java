package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.util.Prompt;

// "/lesson/deleta 커멘드 사용
public class LessonDeleteCommand implements Command {

  ObjectInputStream in;
  ObjectOutputStream out;

  Prompt prompt;

  public LessonDeleteCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.in = in;
    this.out = out;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호 ? ");

      out.writeUTF("/lesson/delete");
      out.writeInt(no);
      out.flush();

      String respinse = in.readUTF();

      if (respinse.equals("FAIL")) {
        System.out.println(in.readUTF());
        return;
      }

      System.out.println("수업을 삭제했습니다.");
    } catch (Exception e) {
      System.out.println("명령 실행 중 오류 발생!");
    }
  }
}
