// 게시글 번호로 찾는 겍채를 찾는 코드를 관리하기 쉽게 별도의 메소드로 분리한다.
// => indexOfBoard(int) 메서드 추가
// 
package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.List;
import com.eomcs.lms.util.Prompt;



public class BoardHandler {
  // 목록을 다루는 객체를 지정할 때,
  // => 특정 클래스(예: AbstractList, LinkedList, ArrayList)를 지정하는 대신에,
  // => 사용 규칙(예: Lilst)을 따르는 객체를 지정함으로써
  // 더 다양한 타입의 객체로 교체할수 있게 만든다.
  // => List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.
  List<Board> boardList;

  Prompt prompt;

  public BoardHandler(Prompt prompt, List<Board> list) {
    // list 파리미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    this.boardList = list;
  }


  public void listBoard() {
    Board[] arr = this.boardList.toArray(new Board[this.boardList.size()]);
    for (Board b : arr) {
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

  public  void addBoard() {
    Board board = new Board();

    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("내용? "));
    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    this.boardList.add(board);

    System.out.println("저장하였습니다.");
  }

  public void detailBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호에 게시글이 없습니다.");
      return;
    }

    Board board = this.boardList.get(index);
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회소: %d\n", board.getViewCount());
  }

  public void updateBoard() {

    int index = indexOfBoard(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }
    Board oldBoard = this.boardList.get(index);

    Board newBoard = new Board();

    newBoard.setNo(oldBoard.getNo());

    newBoard.setTitle(prompt.inputString(
        String.format("내용(%s)? ", oldBoard.getTitle()),
        oldBoard.getTitle()));

    newBoard.setViewCount(oldBoard.getViewCount());

    newBoard.setDate(new Date(System.currentTimeMillis()));

    if (oldBoard.equals(newBoard)) {
      System.out.println("게시물 변경을 취소하였습니다.");
      return;
    }
    this.boardList.set(index, newBoard);
    System.out.println("게시물을 변경했습니다.");
  }


  public void deleteBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다..");
      return;
    }

    this.boardList.remove(index);

    System.out.println("게시글을 삭제하였습니다.");
  }

  private int indexOfBoard(int no) {
    for (int i = 0; i < this.boardList.size(); i++) {
      if (this.boardList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}