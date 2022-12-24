package kr.co.intranet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.intranet.model.MemberDAO;

@WebServlet("/UserLoginCtrl.do")
public class UserLoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//전달받은 데이터
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		//DAO에 저장(데이터 저장값 반환할 때)
		MemberDAO dao = new MemberDAO();
		int cnt = dao.userLogin(email, pw);
		HttpSession session = request.getSession();
		
		//DAO 반환조건
		if(cnt==1) {
			session.setAttribute("sid", email);
			response.sendRedirect("/GetMainCtrl.do");
		} else {
			response.sendRedirect(request.getContextPath());
		}
	}
}
