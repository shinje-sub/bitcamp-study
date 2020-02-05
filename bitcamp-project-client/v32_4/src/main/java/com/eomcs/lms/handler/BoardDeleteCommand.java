
package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.util.Prompt;


// "/board/delete" 명령어 처리
public class BoardDeleteCommand implements Command {

  ObjectInputStream in;
  ObjectOutputStream out;

  Prompt prompt;

  public BoardDeleteCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.in = in;
    this.out = out;
    this.prompt = prompt;
  }


  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호? ");

      out.writeUTF("/board/delete");
      out.writeInt(no);
      out.flush();

      String respinse = in.readUTF();

      if (respinse.equals("FAIL")) {
        System.out.println(in.readUTF());
        return;
      }

      System.out.println("게시글을 삭제하였습니다.");


    } catch (Exception e) {
      System.out.println("명령 실행 중 오류 발생!");
    }


  }
}
