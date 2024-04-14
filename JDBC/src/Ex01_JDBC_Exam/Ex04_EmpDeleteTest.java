package Ex01_JDBC_Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex04_EmpDeleteTest {
	public static void main(String[] args) {
		Ex04_EmpDeleteTest obj = new Ex04_EmpDeleteTest();
		int deleteId = 0;
		Scanner key = new Scanner(System.in); 
		System.out.println("삭제할 아이디: ");
		deleteId = key.nextInt();
		key.close();
		obj.delete(deleteId);
	}
	public void delete(int deleteId) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete emp ");
		sql.append("where empno = '"+ deleteId+"'");
		try {
			// 1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!");
			// 2. 연결하기
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공"+con);
			// 3. sql문을 실행하기 위한 객체를 만들기
			Statement stmt = con.createStatement();
			System.out.println("Statement 객체 생성완료"+stmt);
		
			int result = stmt.executeUpdate(sql.toString());
			
			System.out.println(result + "개 행 삭제성공!");		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
