// 게시글 번호로 찾는 겍채를 찾는 코드를 관리하기 쉽게 별도의 메소드로 분리한다.
// => indexOfBoard(int) 메서드 추가
// 
package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.ArrayList;


public class BoardHandler {

  ArrayList<Board> boardList;

  Scanner input;

  public BoardHandler(Scanner input) {
    this.input = input;
    this.boardList = new ArrayList<Board>(); // 안에 내용 생략 가능하다.

  }

  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    this.boardList = new ArrayList<>(); 
  }

  public void listBoard() {
    // BoardList의 보관된 값을 받을 배열을 준비한다.
    Board[] arr = new Board[this.boardList.size()];

    //toArray()에게 빈 배열을 넘겨서 복사 받는다.
    this.boardList.toArray(arr);

    for (Board b : arr) {
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

  public  void addBoard() {
    Board board = new Board();

    System.out.print("번호? ");
    board.setNo(input.nextInt());
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.setTitle(input.nextLine());

    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);


    this.boardList.add(board);

    System.out.println("저장하였습니다.");
  }

  public void detailBoard() {
    System.out.print("번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤의 남은 공백 제거

    // 게시글 번호로 객체를 찾는다.
    int index = indexOfBoard(no);

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
    System.out.print("번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤의 남은 공백 제거

    // 게시글 번호로 객체를 찾는다.
    int index = indexOfBoard(no);

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }
    Board oldBoard = this.boardList.get(index);
    System.out.printf("내용(%s)? ", oldBoard.getTitle());
    String title = input.nextLine();


    if (title.length() == 0) {
      System.out.println("게시글 변경을 취소했습니다.");
      return;
    }

    Board newBoard = new Board();
    newBoard.setNo(oldBoard.getNo());
    newBoard.setViewCount(oldBoard.getViewCount());
    newBoard.setTitle(title);
    newBoard.setDate(new Date(System.currentTimeMillis()));

    this.boardList.set(index, newBoard);
    System.out.println("게시글을 변경했습니다.");
  }

  public void deleteBoard() {
    System.out.print("번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤의 남은 공백 제거

    // 게시글 번호로 객체를 찾는다.
    int index = indexOfBoard(no);

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