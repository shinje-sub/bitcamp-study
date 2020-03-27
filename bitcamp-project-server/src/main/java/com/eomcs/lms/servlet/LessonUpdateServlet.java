package com.eomcs.lms.servlet;

<<<<<<< Updated upstream
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Lesson;
=======
import java.io.PrintStream;
import java.util.Scanner;
import com.eomcs.lms.domain.Carinfor;
>>>>>>> Stashed changes
import com.eomcs.lms.service.LessonService;
import com.eomcs.util.RequestMapping;

@Component
public class LessonUpdateServlet {

  LessonService lessonService;

  public LessonUpdateServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

<<<<<<< Updated upstream
  @RequestMapping("/lesson/update")
  public void service(Map<String, String> params, PrintWriter out) throws Exception {

    Lesson lesson = new Lesson();
    lesson.setNo(Integer.parseInt(params.get("no")));
    lesson.setTitle(params.get("title"));
    lesson.setDescription(params.get("description"));
    lesson.setStartDate(Date.valueOf(params.get("startDate")));
    lesson.setEndDate(Date.valueOf(params.get("endDate")));
    lesson.setTotalHours(Integer.parseInt(params.get("totalHours")));
    lesson.setDayHours(Integer.parseInt(params.get("dayHours")));

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<meta http-equiv='refresh' content='2;url=/lesson/list'>");
    out.println("<title>강의 변경</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 변경 결과</h1>");
=======
  @Override
  public void service(Scanner in, PrintStream out) throws Exception {

    int no = Prompt.getInt(in, out, "번호? ");

    Carinfor old = lessonService.get(no);
    if (old == null) {
      out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    Carinfor lesson = new Carinfor();

    lesson.setNo(no);
    lesson.setTitle(Prompt.getString(in, out, //
        String.format("강의명(%s)? \n", old.getTitle())));
    lesson.setDescription(Prompt.getString(in, out, //
        String.format("내용:(%s)? \n", old.getDescription())));
    lesson.setStartDate(Prompt.getDate(in, out, //
        String.format("강의 시작일(%s)? \n", old.getStartDate())));

    lesson.setEndDate(Prompt.getDate(in, out, //
        String.format("강의 종료일(%s)? \n", old.getEndDate())));

    lesson.setTotalHours(Prompt.getInt(in, out, //
        String.format("총 강의 시간(%d)? \n", old.getTotalHours())));

    lesson.setDayHours(Prompt.getInt(in, out, //
        String.format("총 수업 시간(%d)? \n", old.getDayHours())));

>>>>>>> Stashed changes

    if (lessonService.update(lesson) > 0) {
      out.println("<p>강의를 변경했습니다.</p>");

    } else {
      out.println("<p>변경에 실패했습니다.</p>");
    }

    out.println("</body>");
    out.println("</html>");
  }
}
