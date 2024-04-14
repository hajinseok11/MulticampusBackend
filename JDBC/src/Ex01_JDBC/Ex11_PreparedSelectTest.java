package Ex01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// Statement로 test
public class Ex11_PreparedSelectTest {

	public static void main(String[] args) {
		Ex11_PreparedSelectTest obj = new Ex11_PreparedSelectTest();
		String selectId = null;
		try (Scanner key = new Scanner(System.in)) {
			System.out.println("조회할 아이디: ");
			selectId = key.nextLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		obj.select(selectId);
		
	}
	public void select(String selectId) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select * from member where id = '" + selectId+"'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			// 모든 select문은 동일하게 작업
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs);
			// 결과 처리 - 조회된 모든 레코드를 읽기
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.print(rs.getInt("point")+"\t");
				System.out.println(rs.getString(7));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
