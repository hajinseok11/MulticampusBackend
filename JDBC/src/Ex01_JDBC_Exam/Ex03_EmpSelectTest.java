package Ex01_JDBC_Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03_EmpSelectTest {
	public static void main(String[] args) {
		Ex03_EmpSelectTest obj = new Ex03_EmpSelectTest();
		obj.selectAll();
	}
	public void selectAll() {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select * from emp";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!");
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			// 모든 select문은 동일하게 작업
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs);
			// 결과 처리 - 조회된 모든 레코드를 읽기
			System.out.println("모든 레코드 조회");
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getInt("sal")+"\t");
				System.out.print(rs.getInt("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.println(rs.getString(7));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
