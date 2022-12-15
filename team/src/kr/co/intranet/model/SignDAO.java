package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.intranet.dto.SignDTO;

public class SignDAO {
	//DB 선언
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//결재목록(전체)
	public ArrayList<SignDTO> getSignList() {
		ArrayList<SignDTO> signList = new ArrayList<SignDTO>();
		try {
			conn = Oracle.getConnection();
			pstmt = conn.prepareStatement(Oracle.SIGN_LIST_ALL);
			rs = pstmt.executeQuery();
			//목록호출
			while(rs.next()) {
				SignDTO sign = new SignDTO();
				sign.setSno(rs.getInt("sno"));
				sign.setTitle(rs.getString("title"));
				sign.setContent(rs.getString("content"));
				sign.setSid(rs.getString("sid"));
				sign.setRegdate(rs.getString("regdate"));
			}
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("SQL구문이 정상적으로 처리되지 않았습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("잘못된 연산 및 요청으로 목록을 불러오지 못했습니다.");
		} finally {
			Oracle.close(rs, pstmt, conn);
		}
		return signList;
	}

	//결재처리
	public int addSign(SignDTO dto) {
		int cnt = 0;
		try {	
			conn = Oracle.getConnection();
			pstmt = conn.prepareStatement(Oracle.SIGN_INSERT);
			pstmt.setInt(1, dto.getSno());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getSid());
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
			Oracle.close(pstmt, conn);
		}
		return cnt;
	}
	
	//결재목록(하나)
	public SignDTO getSignDetail(int sno) {
		SignDTO sign = new SignDTO();
		try {
			conn = Oracle.getConnection();
			pstmt = conn.prepareStatement(Oracle.SIGN_LIST_ONE);
			pstmt.setInt(1, sno);
			rs = pstmt.executeQuery();
			//목록호출
			if(rs.next()) {
				sign.setSno(rs.getInt("sno"));
				sign.setTitle(rs.getString("title"));
				sign.setContent(rs.getString("content"));
				sign.setSid(rs.getString("sid"));
				sign.setRegdate(rs.getString("regdate"));
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
			Oracle.close(rs, pstmt, conn);
		}
		return sign;
	}	
}
