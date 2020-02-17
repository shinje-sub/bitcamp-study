package com.eomcs.lms.dao.handler;

import com.eomcs.lms.dao.domain.Lesson;
import com.eomcs.lms.dao.domain.LessonDao;
import com.eomcs.lms.dao.util.Prompt;

// "/lesson/update" 커멘드 실행
public class LessonUpdateCommand implements Command {

  LessonDao lessonDao;
  Prompt prompt;

  public LessonUpdateCommand(LessonDao lessonDao, Prompt prompt) {
    this.lessonDao = lessonDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호? ");

      Lesson oldLesson = null;
      try {

        oldLesson = lessonDao.findByNo(no);
      } catch (Exception e) {
        System.out.println("해당 번호의 게시글이 없습니다!");
        return;
      }

      Lesson newLesson = new Lesson();

      newLesson.setTitle(prompt.inputString(String.format("수업명(%s)? ", oldLesson.getTitle()),
          oldLesson.getTitle()));
      newLesson.setDescription(prompt.inputString(
          String.format("설명(%s)? ", oldLesson.getDescription()), oldLesson.getDescription()));
      newLesson.setStartDate(prompt.inputDate(String.format("시작일(%s)? ", oldLesson.getStartDate()),
          oldLesson.getStartDate()));
      newLesson.setEndDate(prompt.inputDate(String.format("종료일(%s)? ", oldLesson.getEndDate()),
          oldLesson.getEndDate()));
      newLesson.setTotalHours(prompt.inputInt(
          String.format("총수업시간(%s)? ", oldLesson.getTotalHours()), oldLesson.getTotalHours()));
      newLesson.setDayHours(prompt.inputInt(String.format("일수업시간(%s)? ", oldLesson.getDayHours()),
          oldLesson.getDayHours()));

      lessonDao.update(newLesson);
      System.out.println("수업을 변경했습니다.");

    } catch (Exception e) {
      System.out.println("명령 실행 중 오류 발생!");
    }
  }
}
