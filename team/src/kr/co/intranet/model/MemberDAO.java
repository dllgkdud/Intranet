package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.co.intranet.dto.MemberDTO;

public class MemberDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	
	//회원가입
	public int joinMember(MemberDTO member){
	 int cnt = 0;
	 try {
		 con = Maria.getConnection();
		 pstmt = con.prepareStatement(Maria.MEMBER_JOIN);
		 
		 pstmt.setString(1, member.getId());
		 pstmt.setString(2, member.getPw());
		 pstmt.setString(3, member.getName());
		 pstmt.setString(4, member.getTel());
		 pstmt.setString(5, member.getEmail());
		 pstmt.setString(6, member.getAddr());
		 cnt = pstmt.executeUpdate();
	 }catch(ClassNotFoundException e){
		System.out.println("드라이버 로딩 실패");
		e.printStackTrace();
	 }catch(SQLException e){
		System.out.println("SQL 구문이 처리되지 못했습니다.");
		e.printStackTrace();
	} catch(Exception e){
		System.out.println("잘못된 연산 및 요청으로 인해 목록을 불러오지 못했습니다.");
	} finally {
		Maria.close(pstmt, con);
	}
	 return cnt;
	}
	
	//중복 아이디 체크 
	public int idCheckPro(String id){
		int cnt = 0;
		try {
			con = Maria.getConnection();
			pstmt = con.prepareStatement(Maria.MEMBER_ID_CHECK);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){ cnt = cnt + 1;	} else { cnt = 0;	}
		} catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
		} catch(Exception e){
			System.out.println("SQL 구문이 처리되지 못했거나 연산이 잘못되었습니다.");
		} finally {
			Maria.close(rs, pstmt, con);
		}
		return cnt;
	}

	//MemberList [회원 목록]
	public ArrayList<MemberDTO> getMemberList() {
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		try {
			con = Maria.getConnection();
			pstmt = con.prepareStatement(Maria.MEMBER_SELECT_ALL);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setTel(rs.getString("tel"));
				dto.setEmail(rs.getString("email"));
				dto.setAddr(rs.getString("addr"));
				dto.setRegdate(rs.getString("regdate"));
				System.out.println(dto.getId());
				memberList.add(dto);
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
				Maria.close(rs, pstmt, con);
			}
			return memberList;
		}
		
	
		//MemberInfo [회원 정보] 
		public MemberDTO memberInfo(String id){
			MemberDTO dto = new MemberDTO();
			
			try {
				con = Maria.getConnection();
				pstmt = con.prepareStatement(Maria.MEMBER_SELECT_ONE);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if(rs.next()){
					dto.setId(rs.getString("id"));
					dto.setPw(rs.getString("pw"));
					dto.setName(rs.getString("name"));
					dto.setTel(rs.getString("tel"));
					dto.setEmail(rs.getString("email"));
					dto.setAddr(rs.getString("addr"));
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
				Maria.close(rs, pstmt, con);
			}
			return dto;
		}
}

