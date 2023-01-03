package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import kr.co.intranet.dto.DownBoardDTO;

public class DownBoardDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	String sql ="";
	
	//리스트
	public ArrayList<DownBoardDTO> getdownBoardList() {
		ArrayList<DownBoardDTO> downBoardList = new ArrayList<DownBoardDTO>();
		try {
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.SELECT_DOWNBAORD_ALL);
			rs = pstmt.executeQuery();
			while(rs.next()){
				DownBoardDTO dto = new DownBoardDTO();
				dto.setUpno(rs.getInt("upno"));
				dto.setTitle(rs.getString("title"));
				dto.setEmail(rs.getString("email"));
				dto.setFilename(rs.getString("filename"));
				dto.setUploaddate(rs.getString("uploaddate"));
				downBoardList.add(dto);
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
		return downBoardList;
	}
	
	public int Upload(DownBoardDTO dto){
		int cnt = 0;
		try {
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.INSERT_DOWNBOARD);
			pstmt.setString(1, dto.getEmail()); 
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getFilename());
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
	
	public int Delete(DownBoardDTO dto){
		int cnt = 0;
		try {
			con = Oracle.getConnection();
			pstmt = con.prepareStatement(Oracle.DELETE_DOWNBOARD);
			pstmt.setInt(1, dto.getUpno()); 
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
