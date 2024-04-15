package Ex01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex08_PreparedUpdateTest {
	public static void main(String[] args) {
		Ex08_PreparedUpdateTest obj = new Ex08_PreparedUpdateTest();
		Scanner key = new Scanner(System.in);
		System.out.print("기존주소: ");
		String addr = key.nextLine();
		
		System.out.print("변경할 주소: ");
		String setAddr = key.nextLine();
		
		obj.Update(addr, setAddr);
	}
	public void Update(String addr, String setAddr) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update member set addr = ? where addr = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공"+con);
			// 1. sql문이 미리 파싱될 수 있도록 PreparedStatement객체 생성
			PreparedStatement ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, setAddr);
			ptmt.setString(2, addr);
			
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 수정성공!");		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
