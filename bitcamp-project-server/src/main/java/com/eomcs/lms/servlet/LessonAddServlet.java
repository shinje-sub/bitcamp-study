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
public class LessonAddServlet {

  LessonService lessonService;

  public LessonAddServlet(LessonService lessonService) {
    this.lessonService = lessonService;
  }

<<<<<<< Updated upstream
  @RequestMapping("/lesson/add")
  public void service(Map<String, String> params, PrintWriter out) throws Exception {
    Lesson lesson = new Lesson();
    lesson.setTitle(params.get("title"));
    lesson.setDescription(params.get("description"));
    lesson.setStartDate(Date.valueOf(params.get("startDate")));
    lesson.setEndDate(Date.valueOf(params.get("endDate")));
    lesson.setTotalHours(Integer.parseInt(params.get("totalHours")));
    lesson.setDayHours(Integer.parseInt(params.get("dayHours")));
=======
  @Override
  public void service(Scanner in, PrintStream out) throws Exception {
    Carinfor lesson = new Carinfor();
>>>>>>> Stashed changes

    lessonService.add(lesson);

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<meta http-equiv='refresh' content='2;url=/lesson/list'>");
    out.println("<title>강의 입력</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 입력 결과</h1>");
    out.println("<p>새 강의를 등록했습니다.</p>");
    out.println("</body>");
    out.println("</html>");
  }
}
