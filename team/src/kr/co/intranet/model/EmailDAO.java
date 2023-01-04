package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.intranet.dto.EmailDTO;

public class EmailDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	String sql = "";
	
	//SendEmailList [보낸 이메일 목록] 
	public ArrayList<EmailDTO> getEmailList() {
		ArrayList<EmailDTO> emailList = new ArrayList<EmailDTO>();
		
		try {
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.EMAIL_SELECT_ALL);
			rs = pstmt.executeQuery();
			while(rs.next()){
				EmailDTO dto = new EmailDTO();
				dto.setAuthor(rs.getString("author"));
				dto.setFr(rs.getString("fr"));
				dto.setTel(rs.getString("tel"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setRegdate(rs.getString("regdate"));
				emailList.add(dto);
			}
		} catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch(SQLException e){
			System.out.println("SQL 구문이 처리되지 못했습니다.");
			e.printStackTrace();
		} catch(Exception e){
			System.out.println("잘못된 연산 및 요청으로 인해 목록을 불러오지 못했습니다.");
		} finally {
			Oracle.close(rs, pstmt, con);
		}
		return emailList;
	}
	
	//EmailDetail [메일 내용 상세 보기]
	public EmailDTO getEmail(String author){
		EmailDTO dto = new EmailDTO();
		try {
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.EMAIL_SELECT_ONE);
			pstmt.setString(1, author);	
			rs = pstmt.executeQuery();
			if(rs.next()){
				dto.setAuthor(rs.getString("author"));
				dto.setFr(rs.getString("fr"));
				dto.setTel(rs.getString("tel"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setRegdate(rs.getString("regdate"));
			}

		} catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch(SQLException e){
			System.out.println("SQL 구문이 처리되지 못했습니다.");
			e.printStackTrace();
		} catch(Exception e){
			System.out.println("잘못된 연산 및 요청으로 인해 목록을 불러오지 못했습니다.");
		} finally {
			Oracle.close(rs, pstmt, con);
		}
		return dto;
	}
	
	//SendEmail [메일 작성]
	public int sendEmail(EmailDTO dto){
		int cnt = 0;
		try {
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.EMAIL_SEND);
			pstmt.setString(1, dto.getFr());
			pstmt.setString(2, dto.getTel());
			pstmt.setString(3, dto.getTitle());
			pstmt.setString(4, dto.getContent());
			cnt = pstmt.executeUpdate();
		} catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch(SQLException e){
			System.out.println("SQL 구문이 처리되지 못했습니다.");
			e.printStackTrace();
		} catch(Exception e){
			System.out.println("잘못된 연산 및 요청으로 인해 목록을 불러오지 못했습니다.");
		} finally {
			Oracle.close(pstmt, con);
		}
		return cnt;
	}
}
