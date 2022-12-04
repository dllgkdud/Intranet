package kr.co.intranet.util;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import org.junit.Test;

public class OracleTest {
	private static final Logger log = Logger.getGlobal();
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "system";
	private static final String PASS = "1234";
	
	@Test
	public void test() throws ClassNotFoundException {
		Class.forName(DRIVER);
		String sql = "select sysdate now from dual";
		
		try (
			//DB 연결
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			){
			
			//DB 연결 테스트 후 드라이버, sql, 쿼리 실행결과 호출
			assertNotNull(conn);
			log.info("conn : "+conn);
			log.info("pstmt : "+pstmt);
			rs.next();
			log.info("now : "+rs.getDate("now"));
			
			//DB 연결 종료
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		//fail("Not yet implemented");
	}
}
