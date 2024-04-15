package Ex01_JDBC_Exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	// 드라이버 로딩
	// => 클래스가 로딩될 때 한 번 실행된다.
	static {
		System.out.println("스태틱 블럭");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// DB서버 접속하기
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	// 자원반납
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(con!=null)con.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void close(Connection con) {
			
	}
}
