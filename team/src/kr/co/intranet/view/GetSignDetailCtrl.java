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

@WebServlet("/GetSignDetailCtrl.do")
public class GetSignDetailCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전역변수
		int sno = Integer.parseInt(request.getParameter("sno"));		
		
		//DAO 데이터 저장
		SignDAO dao = new SignDAO();
		SignDTO vo = dao.signDetail(sno);
		
		request.setAttribute("vo", vo);
		
		//포워딩
		RequestDispatcher view = request.getRequestDispatcher("./sign/signDetail.jsp");
		view.forward(request, response);
	}

}
