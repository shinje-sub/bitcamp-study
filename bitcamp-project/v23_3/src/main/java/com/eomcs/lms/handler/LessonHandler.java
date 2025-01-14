// 사용자 입력을 받는 코드를 별도의 메서드로 분리한다.
// 
package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.List;
import com.eomcs.lms.util.Prompt;


public class LessonHandler {

//목록을 다루는 객체를 지정할 때,
 // => 특정 클래스(예: AbstractList, LinkedList, ArrayList)를 지정하는 대신에,
 // => 사용 규칙(예: Lilst)을 따르는 객체를 지정함으로써
 // 더 다양한 타입의 객체로 교체할수 있게 만든다.
 // => List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
 // 결국 유지보수를 더 유연하게 하기 위함이다.
  List<Lesson> lessonList;

  Prompt prompt;

  public LessonHandler(Prompt prompt, List<Lesson> list) {
    // list 파리미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    this.lessonList = list;


  }


  public void listLesson() {
    // LessonList의 보관된 값을 받을 배열을 준비한다.
    Lesson[] arr = this.lessonList.toArray(new Lesson[this.lessonList.size()]);
    for (Lesson l : arr) {
      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          l.getNo(), l.getTitle(), l.getStartDate(), l.getEndDate(), l.getTotalHours());
    }
  }

  public  void addLesson() {
    Lesson lesson = new Lesson();

    lesson.setNo(prompt.inputInt("번호? "));
    lesson.setTitle(prompt.inputString("수업명? "));
    lesson.setDescription(prompt.inputString("설명? "));
    lesson.setStartDate((prompt.inputDate("시작일? ")));
    lesson.setEndDate((prompt.inputDate("종료일? ")));
    lesson.setTotalHours(prompt.inputInt("총수업시간? "));
    lesson.setDayHours(prompt.inputInt("일수업시간? "));

    this.lessonList.add(lesson);

    System.out.println("저장하였습니다.");
  }

  public void detailLesson() {
    int index = indexOfLesson(prompt.inputInt("번호 ? "));

    if (index == -1) {
      System.out.println("게시물 인덱스가 유효하지 않습니다.");
      return;
    }

    Lesson lesson = this.lessonList.get(index);
    System.out.printf("번호: %d\n", lesson.getNo());
    System.out.printf("수업명: %s\n", lesson.getTitle());
    System.out.printf("설명: %s\n", lesson.getDescription());
    System.out.printf("시작일: %s\n", lesson.getStartDate());
    System.out.printf("종료일: %s\n", lesson.getEndDate());
    System.out.printf("총수업시간: %d\n", lesson.getTotalHours());
    System.out.printf("일수업시간: %d\n", lesson.getDayHours());
  }


  public void updateLesson() {

    int index = indexOfLesson(prompt.inputInt("번호 ? "));

    if (index == -1) {
      System.out.println("수업 인덱스가 유효하지 않습니다.");
      return;
    }
    Lesson oldLesson = this.lessonList.get(index);

    Lesson newLesson = new Lesson();

    newLesson.setNo(oldLesson.getNo());

    newLesson.setTitle(prompt.inputString(
        String.format("수업명(%s)? ", oldLesson.getTitle()),
        oldLesson.getTitle()));

    newLesson.setDescription(prompt.inputString(
        String.format("설명(%s)? ", oldLesson.getDescription()),
        oldLesson.getDescription()));

    newLesson.setStartDate(prompt.inputDate(
        String.format("시작일(%s)? ", oldLesson.getStartDate()),
        oldLesson.getStartDate()));

    newLesson.setEndDate(prompt.inputDate(
        String.format("종료일(%s)? ", oldLesson.getEndDate()),
        oldLesson.getEndDate()));

    newLesson.setTotalHours(prompt.inputInt
        (String.format("총수업시간(%s)? ", oldLesson.getTotalHours()),
            oldLesson.getTotalHours()));

    newLesson.setDayHours(prompt.inputInt
        (String.format("일수업시간(%s)? ", oldLesson.getDayHours()),
            oldLesson.getDayHours()));

    if (oldLesson.equals(newLesson)) {
      System.out.println("수업 변경을 취소하였습니다.");
      return;
    }
    this.lessonList.set(index, newLesson);
    System.out.println("수업을 변경했습니다.");
  }

  public void deleteLesson() {
    int index = indexOfLesson(prompt.inputInt("번호 ? "));

    if (index == -1) {
      System.out.println("해당 수업을 찾을 수 없습니다.");
      return;
    }

    this.lessonList.remove(index);

    System.out.println("수업을 삭제했습니다.");
  }
  private int indexOfLesson(int no) {
    for (int i = 0; i < this.lessonList.size(); i++) {
      if (this.lessonList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }



}
