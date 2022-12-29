package kr.co.intranet.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.intranet.dto.MemberDTO;
import kr.co.intranet.model.MemberDAO;

@WebServlet("/MemberInfoCtrl.do")
public class MemberInfoCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");


		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.memberInfo(id);

		request.setAttribute("dto", dto);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/member/memberUpdate.jsp");
		view.forward(request, response);
		
	}
}