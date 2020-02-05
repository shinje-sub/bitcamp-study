package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.Prompt;

// "/lesson/detail" 커멘드 사용
public class LessonDetailCommand implements Command {

  int index;
  ObjectOutputStream out;
  ObjectInputStream in;
  Prompt prompt;

  public LessonDetailCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.out = out;
    this.in = in;
    this.prompt = prompt;
  }

  @Override

  public void execute() {
    try {
      int no = prompt.inputInt("번호 ? ");

      out.writeUTF("/lesson/detail");
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

      Lesson lesson = (Lesson) in.readObject();
      System.out.printf("번호: %d\n", lesson.getNo());
      System.out.printf("수업명: %s\n", lesson.getTitle());
      System.out.printf("설명: %s\n", lesson.getDescription());
      System.out.printf("시작일: %s\n", lesson.getStartDate());
      System.out.printf("종료일: %s\n", lesson.getEndDate());
      System.out.printf("총수업시간: %d\n", lesson.getTotalHours());
      System.out.printf("일수업시간: %d\n", lesson.getDayHours());
    } catch (Exception e) {
      System.out.println("명령 실행 중 오류 발생!");
    }
  }
}
