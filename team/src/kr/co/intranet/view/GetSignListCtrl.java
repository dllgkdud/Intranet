package kr.co.intranet.view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.dto.SignDTO;
import kr.co.intranet.model.SignDAO;

@WebServlet("/GetSignListCtrl.do")
public class GetSignListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//UTF-8
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		//DAO 데이터 저장
		SignDAO dao = new SignDAO();
		ArrayList<SignDTO> signList = dao.signList();
		
		request.setAttribute("signList", signList);
		
		//포워딩
		RequestDispatcher view = request.getRequestDispatcher("./sign/signList.jsp");
		view.forward(request, response);
	}

}
