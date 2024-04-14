package Ex01_JDBC_Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex02_EmpUpdateTest {

	public static void main(String[] args) {
		Ex02_EmpUpdateTest obj = new Ex02_EmpUpdateTest();
		Scanner key = new Scanner(System.in);
		System.out.println("급여: ");
		int sal = key.nextInt();
		
		System.out.println("아이디: ");
		int empno = key.nextInt();
		key.close();
		
		obj.updateSal(sal, empno);
	}
	public void updateSal(int sal, int empno) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update emp ";
		sql = sql + "set sal ='" +sal+ "' ";
		sql = sql + "where empno = '"+empno+"'";
		
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
