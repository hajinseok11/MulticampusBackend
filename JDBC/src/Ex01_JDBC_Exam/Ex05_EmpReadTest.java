package Ex01_JDBC_Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Ex01_JDBC.Ex11_PreparedSelectTest;

public class Ex05_EmpReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex05_EmpReadTest obj = new Ex05_EmpReadTest();
		int selectId = 0;
		Scanner key = new Scanner(System.in);
		System.out.println("조회할 아이디: ");
		selectId = key.nextInt();
		key.close();
		obj.select(selectId);
		
	}
	public void select(int selectId) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select * from emp where empno = '" + selectId+"'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			// 모든 select문은 동일하게 작업
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs);
			// 결과 처리 - 조회된 모든 레코드를 읽기
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getInt("sal")+"\t");
				System.out.print(rs.getInt("comm")+"\t");
				System.out.println(rs.getInt("deptno")+"\t");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}