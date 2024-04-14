package Ex01_JDBC_Exam;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Statement(정적SQL)를 이용해서 insert문 실행하기
public class Ex01_EmpInsertTest {
	public static void main(String[] args) {
		Ex01_EmpInsertTest obj = new Ex01_EmpInsertTest();
			Scanner key = new Scanner(System.in);
			System.out.print("사번: ");
			int empno = key.nextInt();
			
			System.out.print("성명: ");  
			String ename = key.next();
			
			System.out.print("JOB: ");
			String JOB = key.next();
			key.close();
			obj.insert(empno, ename, JOB);
		}
	public void insert(int empno, String ename, String JOB) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "INSERT INTO EMP VALUES("
		+empno+", '"+ename+"','"+JOB+"',null,sysdate,3000,0,null)";
		try {
			// 1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩성공!");
			// 2. 연결하기
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!"+con);
			// 3. SQL문을 실행하기 위한 객체를 만들기
			Statement stmt = con.createStatement();
			System.out.println("Statement객체 생성완료!!!"+stmt);
			// 4. SQL문 실행하기
			int result = stmt.executeUpdate(sql); 
			// 5. 결과처리
			System.out.println(result + "개 행 삽입성공!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}