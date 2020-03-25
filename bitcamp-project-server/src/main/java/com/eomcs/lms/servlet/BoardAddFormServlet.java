package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.eomcs.util.RequestMapping;

@Component("/board/add") // 나중에 이 이름으로 서블릿을 찾을 수 있도록 설정한다.
public class BoardAddFormServlet {

  @RequestMapping("/board/addForm")
  public void service(Map<String, String> params, PrintStream out) throws Exception {
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>게시글 입력</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>게시물 입력</h1>");
    out.println(" <form action='/board/add'>");
    out.println("내용:<br>");
    out.println("<textarea name='title' rows='5' cols='60'></textarea><br>");
    out.println("<button>제출</button>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");

    // Board board = new Board();
    // board.setTitle(Prompt.getString(in, out, "제목? "));
    // boardService.add(board);
    // out.println("새 게시글을 등록했습니다.");
  }
}
