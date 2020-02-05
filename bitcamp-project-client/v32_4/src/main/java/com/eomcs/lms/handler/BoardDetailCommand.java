package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.Prompt;

// "/board/detail" 명령 처리
public class BoardDetailCommand implements Command {

  int index;
  Prompt prompt;

  ObjectOutputStream out;
  ObjectInputStream in;

  public BoardDetailCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.prompt = prompt;
    this.in = in;
    this.out = out;
  }

  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호? ");

      out.writeUTF("/board/detail");
      out.writeInt(no);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        System.out.println(in.readUTF());
        return;
      }

      if (index == -1) {
        System.out.println("해당 번호에 게시글이 없습니다.");
        return;
      }

      Board board = (Board) in.readObject();
      System.out.printf("번호: %d\n", board.getNo());
      System.out.printf("제목: %s\n", board.getTitle());
      System.out.printf("등록일: %s\n", board.getDate());
      System.out.printf("조회소: %d\n", board.getViewCount());
    } catch (Exception e) {
      System.out.println("명령 실행 중 오류 발생!");
    }
  }
}
