package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.Prompt;

public class LessonDeleteServlet implements Servlet {

  // DAO 클래스를 구체적으로 지정하기 보다는
  // 인터페이스를 지정함으로써
  // 향후 다른 구현체로 교체하기 쉽도록 한다.
  //
  LessonService lessonService;

  public LessonDeleteServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    int no = Prompt.getInt(in, out, "번호? ");


    if (lessonService.delete(no) > 0) {
      out.println("강의를 삭제했습니다.");

    } else {
      out.println("해당 번호의 강의가 없습니다.");
    }
  }
}
