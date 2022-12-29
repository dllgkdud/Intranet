package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Maria {

		static final String DRIVER = "oracle.jdbc.OracleDriver";
	    static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	    static final String USER = "system";
	    static final String PW = "1234";
	    
	    //Member 
	    final static String MEMBER_JOIN = "insert into member(id, pw, name, tel, email, addr) values (?,?,?,?,?,?)";
	    final static String MEMBER_ID_CHECK = "select * from member where id=?";
	    final static String MEMBER_EMAIL_CHECK ="select * from member where email=?";
	    final static String MEMBER_SELECT_ALL = "select * from member";
	    final static String MEMBER_SELECT_ONE = "select * from member where id=?";
	    final static String MEMBER_OUT = "delete from member where id=?";
	    
	    //Board
	    final static String BOARD_SELECT_ALL = "select * from board";
	    final static String BOARD_WRITE = "insert into board(no, title, content, id) values (nseq.nextval,?,?,?)"; //sql구문 오류  
	    final static String BOARD_SELECT_ONE = "select * from board where no=?";
	    final static String BOARD_DELETE = "delete from board where no=?";
	    
	    //Email
		final static String Email_SELECT_ALL = "select * from email";
		final static String Email_SELECT_ONE = "select * from email where author=?";
		final static String Email_SEND = "insert into email(fr, tel, title, content) values (?,?,?,?)";
		
		
	    public static Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER, PW);
			return con;
		}
		
		public static void close(PreparedStatement pstmt, Connection con) {
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
		public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
			if(rs!=null){
				try {
					rs.close();
				} catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
}
