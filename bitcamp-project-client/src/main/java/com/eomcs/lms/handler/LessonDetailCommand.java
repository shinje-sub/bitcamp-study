package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.proxy.LessonDaoProxy;
import com.eomcs.lms.util.Prompt;

// "/lesson/detail" 커멘드 사용
public class LessonDetailCommand implements Command {

  LessonDaoProxy lessonDao;
  Prompt prompt;

  public LessonDetailCommand(LessonDaoProxy lessonDao, Prompt prompt) {
    this.lessonDao = lessonDao;
    this.prompt = prompt;
  }

  @Override

  public void execute() {
    try {
      int no = prompt.inputInt("번호 ? ");

      Lesson lesson = lessonDao.findByNo(no);
      System.out.printf("번호: %d\n", lesson.getNo());
      System.out.printf("수업명: %s\n", lesson.getTitle());
      System.out.printf("설명: %s\n", lesson.getDescription());
      System.out.printf("시작일: %s\n", lesson.getStartDate());
      System.out.printf("종료일: %s\n", lesson.getEndDate());
      System.out.printf("총수업시간: %d\n", lesson.getTotalHours());
      System.out.printf("일수업시간: %d\n", lesson.getDayHours());
    } catch (Exception e) {
      System.out.println("조회 실패!");
    }
  }
}
