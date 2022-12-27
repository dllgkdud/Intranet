package kr.co.intranet.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.SignDTO;
import kr.co.intranet.model.SignDAO;

@WebServlet("/UpSignCtrl.do")
public class UpSignCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DAO에서 목록 호출/반환
		int sno = Integer.parseInt(request.getParameter("sno"));
		
		SignDAO dao = new SignDAO();
		SignDTO dto = dao.signDetail(sno);
		
		//DAO에서 받은 데이터 view로 디스패치
		request.setAttribute("dto", dto);
		
		RequestDispatcher view = request.getRequestDispatcher("./sign/upSign.jsp");
		view.forward(request, response);
	}
}
