package Ex01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03_UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update member ";
		sql = sql + "set addr ='서울특별시' ";
		sql = sql + "where addr = '서울시'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!");
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공"+con);
		
			Statement stmt = con.createStatement();
			System.out.println("Statement 객체 생성완료"+stmt);
		
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result + "개 행 수정성공!");		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
