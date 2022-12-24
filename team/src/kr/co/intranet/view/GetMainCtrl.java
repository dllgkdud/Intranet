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

@WebServlet("/GetMainCtrl.do")
public class GetMainCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전역변수
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("sid");
		
		//DAO에서 목록 호출/반환
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.Main(email);
		
		//DAO에서 받은 데이터 view로 디스패치
		request.setAttribute("dto", dto);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Main.jsp");
		view.forward(request, response);
	}
}
