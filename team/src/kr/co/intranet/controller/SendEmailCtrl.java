package kr.co.intranet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.EmailDTO;
import kr.co.intranet.model.EmailDAO;

@WebServlet("/SendEmailCtrl.do")
public class SendEmailCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String fr = request.getParameter("fr");
		String tel = request.getParameter("tel");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		EmailDTO dto = new EmailDTO();
		dto.setFr(fr);
		dto.setTel(tel);
		dto.setTitle(title);
		dto.setContent(content);
		
		EmailDAO dao = new EmailDAO();
		int cnt = dao.sendEmail(dto);
		
		if(cnt>=1){
			response.sendRedirect("GetSendEmailListCtrl.do");
			System.out.println("보내는 메일 내용 저장 성공 ");
		} else {
			response.sendRedirect("./email/sendEmail.jsp");
			System.out.println("보내는 메일 내용 저장 실패");
		}
	}
}
