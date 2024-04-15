package Ex01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex10_PreparedDeleteTest {
	public static void main(String[] args) {
		Ex10_PreparedDeleteTest obj = new Ex10_PreparedDeleteTest();
		String deleteId = null;
		Scanner key = new Scanner(System.in);
		System.out.println("삭제할 아이디: ");
		deleteId = key.next();
		key.close();
		obj.delete(deleteId);
	}
	public void delete(String deleteId) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete member where id =? ");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공"+con);
			// 3. sql문을 실행하기 위한 객체를 만들기
			PreparedStatement ptmt = con.prepareStatement(sql.toString());
			// 2. ?에 값을 세팅
			ptmt.setString(1,deleteId);
			//3. sql실행 - sql문을 전달하지 않는다.
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제성공!");		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
