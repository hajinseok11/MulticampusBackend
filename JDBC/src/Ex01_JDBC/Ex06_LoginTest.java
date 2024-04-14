package Ex01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 실습
 * id와 pass가 일치하면 __님 로그인 성공 메시지 출력하기
 * id와 pass가 일치하지 않으면 로그인 실패 
 */
public class Ex06_LoginTest {

	public static void main(String[] args) {
//		String sql = "select * from member where id = 'bts11' and pass = '1234'"; // 로그인 실패
		String sql = "select * from member where id = 'bts1' and pass = '1234'"; // 로그인 성공
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs);
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.print(rs.getInt("point")+"\t");
				System.out.println(rs.getString(7));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
