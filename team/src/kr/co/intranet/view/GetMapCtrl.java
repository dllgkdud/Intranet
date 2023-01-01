package kr.co.intranet.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.intranet.dto.BoardDTO;
import kr.co.intranet.model.BoardDAO;

@WebServlet("/GetMapCtrl.do")
public class GetMapCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//UTF-8
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		//전역변수
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("sid");
		String pw = (String) session.getAttribute("pw");
		
		
		RequestDispatcher view = request.getRequestDispatcher("./admin/sitemap.jsp");
		view.forward(request, response);
	}
}
