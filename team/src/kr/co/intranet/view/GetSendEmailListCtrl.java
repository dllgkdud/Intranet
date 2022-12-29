package kr.co.intranet.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.EmailDTO;
import kr.co.intranet.model.EmailDAO;

@WebServlet("/GetSendEmailListCtrl.do")
public class GetSendEmailListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		EmailDAO dao = new EmailDAO();
		ArrayList<EmailDTO> emailList = dao.getEmailList();
		
		request.setAttribute("list", emailList);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/email/sendEmailList.jsp");
		view.forward(request, response);
		
	}
}