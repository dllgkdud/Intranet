package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.intranet.dto.SignDTO;

public class SignDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	String sql ="";
	
	//목록
	public ArrayList<SignDTO> signList() {
		ArrayList<SignDTO> signList = new ArrayList<SignDTO>();
		try {	
			con = Oracle.getConnection();			
			pstmt = con.prepareStatement(Oracle.SIGN_SELECT_ALL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//매핑(Mapping)
				SignDTO dto = new SignDTO();
				dto.setSno(rs.getInt("sno"));
				dto.setTitle(rs.getString("title"));
				dto.setEmail(rs.getString("email"));
				dto.setState(rs.getInt("state"));
				dto.setRegdate(rs.getString("regdate"));
				signList.add(dto);
			}
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("SQL구문이 정상적으로 처리되지 않았습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("잘못된 연산 및 요청으로 목록을 불러오지 못했습니다.");
			e.printStackTrace();
		} finally {
			Oracle.close(rs, pstmt, con);
		}
		return signList;
	}
	
	//상세
	public SignDTO signDetail(int sno) {
		SignDTO dto = new SignDTO();
		try {	
			con = Oracle.getConnection();			
			pstmt = con.prepareStatement(Oracle.SIGN_SELECT_ONE);
			pstmt.setInt(1, sno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//매핑(Mapping)
				dto.setSno(rs.getInt("sno"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setEmail(rs.getString("email"));
				dto.setState(rs.getInt("state"));
				dto.setRegdate(rs.getString("regdate"));
			}
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("SQL구문이 정상적으로 처리되지 않았습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("잘못된 연산 및 요청으로 목록을 불러오지 못했습니다.");
			e.printStackTrace();
		} finally {
			Oracle.close(rs, pstmt, con);
		}
		return dto;
	}
	
	//작성
	public int addSign(SignDTO dto) {
		int cnt = 0;
		try {	
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.SIGN_INSERT);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getEmail());
			cnt = pstmt.executeUpdate();
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("SQL구문이 정상적으로 처리되지 않았습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("잘못된 연산 및 요청으로 목록을 불러오지 못했습니다.");
			e.printStackTrace();
		} finally {
			Oracle.close(rs, pstmt, con);
		}
		return cnt;
	}
	
	//삭제
	public int delSign(int sno) {
		int cnt = 0;
		try {	
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.SIGN_DELETE);
			pstmt.setInt(1, sno);
			cnt = pstmt.executeUpdate();
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("SQL구문이 정상적으로 처리되지 않았습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("잘못된 연산 및 요청으로 목록을 불러오지 못했습니다.");
			e.printStackTrace();
		} finally {
			Oracle.close(pstmt, con);
		}
		return cnt;
	}

	public int upSign(SignDTO dto) {
		int cnt = 0;
		try {	
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.SIGN_UPDATE);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getSno());
			cnt = pstmt.executeUpdate();
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("SQL구문이 정상적으로 처리되지 않았습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("잘못된 연산 및 요청으로 목록을 불러오지 못했습니다.");
			e.printStackTrace();
		} finally {
			Oracle.close(pstmt, con);
		}
		return cnt;
	}
}
