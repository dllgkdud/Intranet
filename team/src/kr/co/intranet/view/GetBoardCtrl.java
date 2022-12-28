package kr.co.intranet.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.BoardDTO;
import kr.co.intranet.model.BoardDAO;

@WebServlet("/GetBoardCtrl.do")
public class GetBoardCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int no = Integer.parseInt(request.getParameter("no"));
		
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.getBoard(no);
		
		request.setAttribute("dto", dto);
		
		RequestDispatcher view = request.getRequestDispatcher("./board/boardDetail.jsp");
		view.forward(request, response);
	}
}
