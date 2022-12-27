package kr.co.intranet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.intranet.model.SignDAO;

@WebServlet("/DelSignCtrl.do")
public class DelSignCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//UTF-8
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		//전달받은 데이터
		int sno = Integer.parseInt(request.getParameter("sno"));
		
		//DAO에 저장(데이터 저장값 반환할 때)
		SignDAO dao = new SignDAO();
		int cnt = dao.delSign(sno);
		
		//DAO 반환조건
		if(cnt>0) {
			response.sendRedirect("GetSignListCtrl.do");
		} else {
			response.sendRedirect("GetSignDetailCtrl.do?sno="+sno);
		}
	}

}
