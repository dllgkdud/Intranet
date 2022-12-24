package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.intranet.dto.MemberDTO;

public class MemberDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	String sql ="";
	String key = "%15x";
	
	//로그인
	public int userLogin(String email, String pw) {
		int cnt = 0;
		/*String apw = "";*/
		
		try {	
			con = Oracle.getConnection();			
			pstmt = con.prepareStatement(Oracle.USER_ID_CHECK);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//매핑(Mapping)
				/*apw = AES256.decryptAES256(rs.getString("pw"), key);
				System.out.println("비밀번호 복호화 : "+apw);*/
				if(pw.equals(pw)){
					cnt = 1;
				} else {
					cnt = 0;
				}
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
		return cnt;
	}

	public MemberDTO Main(String email) {
		MemberDTO dto = new MemberDTO();
		try {	
			con = Oracle.getConnection();			
			pstmt = con.prepareStatement(Oracle.USER_ID_CHECK);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setEmail(rs.getString("email"));
				/*dto.setPw(AES256.decryptAES256(rs.getString("pw"), key));*/
				dto.setPw(rs.getString("pw"));
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

}
