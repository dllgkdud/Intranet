package kr.co.intranet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.model.MemberDAO;

@WebServlet("/OutMemberCtrl.do")
public class OutMemberCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		int cnt = dao.outMember(id);
		
		if(cnt>=1){
			response.sendRedirect("GetMemberListCtrl.do");
		} else {
			response.sendRedirect("GetMemberCtrl.do?id="+id);
		}
	}

}
