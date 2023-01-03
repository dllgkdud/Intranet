package kr.co.intranet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle {
	//DB Info
	static final String DRIVER = "oracle.jdbc.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "system";
	static final String PASS = "1234";
	
	//Main(로그인)
	public static final String USER_LOGIN = "select * from emp where email=? and pw=?";
	
	//Sign(전자결재)
	public static final String SIGN_SELECT_ALL = "select * from sign";
	public static final String SIGN_SELECT_ONE = "select * from sign where sno=?";
	public static final String SIGN_INSERT = "insert into sign values(sseq.nextval, ?, ?, ?, 0, sysdate)";
	public static final String SIGN_DELETE = "delete from sign where sno=?";
	public static final String SIGN_UPDATE = "update sign set title=?, content=?, state=? where sno=?";
	
	//Board(공지사항)
	public static final String BOARD_SELECT_ALL = "select * from bboard";
	public static final String BOARD_SELECT_ONE = "select * from bboard where no=?";
	public static final String BOARD_WRITE = "insert into bboard values(nseq.nextval, ?, ?, ?, sysdate)";
	public static final String BOARD_DELETE = "delete from bboard where no=?";
	
	//Member(사원)
	public static final String USER_ADD = "insert into emp values(emp_seq.nextval, ?, ?, ?, ?, ?, ?, sysdate)";
	
	//DownBoard(자료게시판)
	public static final String SELECT_DOWNBAORD_ALL = "select * from downBoard";
	public static final String INSERT_DOWNBOARD = "insert into downBoard values('upno_seq.nextval',?,?,?,sysdate)";
	public static final String DELETE_DOWNBOARD = "delete from downBoard where upno=?";
	
	
	
	//Connection
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		return conn;
	}
	//Connection close(pstmt, conn)
	public static void close(PreparedStatement pstmt, Connection conn) {
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//Connection close(rs, pstmt, conn)
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
