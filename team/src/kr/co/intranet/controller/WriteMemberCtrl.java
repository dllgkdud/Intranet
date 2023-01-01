package kr.co.intranet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.MemberDTO;
import kr.co.intranet.model.MemberDAO;

@WebServlet("/WriteMemberCtrl.do")
public class WriteMemberCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String ename = request.getParameter("ename");
		String dept = request.getParameter("dept");
		String pos = request.getParameter("pos");
		String birth = request.getParameter("birth");
		
		MemberDTO dto = new MemberDTO();
		dto.setEmail(email);
		dto.setPw(pw);
		dto.setEname(ename);
		dto.setDept(dept);
		dto.setPos(pos);
		dto.setBirth(birth);
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.writeMember(dto);
		
		if(cnt>=1){
			response.sendRedirect("GetMemberListCtrl.do");
		} else {
			response.sendRedirect("./member/writeMember.jsp");
		}
	}
}
