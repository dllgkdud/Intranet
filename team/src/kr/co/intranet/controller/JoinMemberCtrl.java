package kr.co.intranet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.MemberDTO;
import kr.co.intranet.model.MemberDAO;

@WebServlet("/JoinMemberCtrl.do")
public class JoinMemberCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//id, pw, name,tel, email, addr
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");
        
		MemberDAO dao = new MemberDAO();
		
		int cnt = 0 , ent = 0, suc = 0;
		
		//아이디 중복 체크
		System.out.println("입력된 아이디 : "+id);
		cnt = dao.idCheckPro(id);
		
		//이메일 중복 체크
		System.out.println("입력된 이메일 : "+email);
		ent = dao.emailCheckPro(email);
		
		MemberDTO member = new MemberDTO();
		boolean result = false;
		
		// 아이디 체크 
		if(cnt>=1){	
			result = false;
			response.sendRedirect("./member/joinMember.jsp?qid="+id);
		} else { 
			result = true;
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setTel(tel);
			member.setEmail(email);
			member.setAddr(addr);
			suc = dao.joinMember(member);
			
			if(suc>=1){
				response.sendRedirect("GetMemberListCtrl.do");
				System.out.println("가입 완료");

			} else {
				response.sendRedirect("./member/joinMember.jsp?qid="+id);
			}
		}
		
		// 이메일 체크
		if(ent>=1){	
			result = false;
			response.sendRedirect("./member/joinMember.jsp?qemail="+email);
		} else { 
			result = true;
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setTel(tel);
			member.setEmail(email);
			member.setAddr(addr);
			suc = dao.joinMember(member);
			
			if(suc>=1){
				response.sendRedirect("GetMemberListCtrl.do");
				System.out.println("가입 완료");

			} else {
				response.sendRedirect("./member/joinMember.jsp?qemail="+email);
			}
		}

	}
	
}