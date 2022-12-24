package kr.co.intranet.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.BoardDTO;
import kr.co.intranet.model.BoardDAO;

@WebServlet("/GetBoardListCtrl.do")
public class GetBoardListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> boardList = dao.getBoardList();
		
		//DAO로 부터 받은 데이터를 VIEW로 보냄
		request.setAttribute("list", boardList);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/board/boardList.jsp");
		view.forward(request, response);
	}
}