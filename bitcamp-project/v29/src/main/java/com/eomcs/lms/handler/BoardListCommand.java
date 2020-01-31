// "/board/list" 명령어 처리
package com.eomcs.lms.handler;

import java.util.Iterator;
import java.util.List;
import com.eomcs.lms.domain.Board;

public class BoardListCommand implements Command {

  List<Board> boardList;


  public BoardListCommand(final List<Board> list) {
    boardList = list;
  }

  @Override
  public void execute() {
    final Iterator<Board> iterator = boardList.iterator();
    while (iterator.hasNext()) {
      final Board b = iterator.next();
      System.out.printf("%d, %s, %s, %d\n", b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }
}

