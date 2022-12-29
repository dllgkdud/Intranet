package kr.co.intranet.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.EmailDTO;
import kr.co.intranet.model.EmailDAO;

@WebServlet("/GetSendEmailDetailCtrl.do")
public class GetSendEmailDetailCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String author = (String) request.getParameter ("author");
		
		EmailDAO dao = new EmailDAO();
		EmailDTO dto = dao.getEmail(author);

		request.setAttribute("dto", dto);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/email/sendEmailDetail.jsp");
		view.forward(request, response);
		
	}
}