package kr.co.intranet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.BoardDTO;
import kr.co.intranet.model.BoardDAO;

@WebServlet("/WriteBoardCtrl.do")
public class WriteBoardCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int no = Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String id = request.getParameter("id");
		
		BoardDTO dto = new BoardDTO();
		dto.setNo(no);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setId(id);
		
		BoardDAO dao = new BoardDAO();
		int cnt = dao.writeBoard(dto);
		
		if(cnt>=1){
			response.sendRedirect("GetBoardListCtrl.do");
			System.out.println("작성 완료");
		} else {
			response.sendRedirect("./board/writeBoard.jsp");
			System.out.println("작성 실패");
		}
	}
}
