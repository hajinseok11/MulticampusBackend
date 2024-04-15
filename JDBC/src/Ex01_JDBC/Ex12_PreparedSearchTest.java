package Ex01_JDBC;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// PreparedStatement(정적SQL)를 이용해서 insert문 실행하기
public class Ex12_PreparedSearchTest {
	public static void main(String[] args) {
		Ex12_PreparedSearchTest obj = new Ex12_PreparedSearchTest();
		Scanner key = new Scanner(System.in);	
		System.out.print("컬럼: ");  
		String column = key.next();
		System.out.print("검색 키워드: ");  
		String value = key.next();
		obj.search(column, value);
		key.close();
	}
	public void search(String column, String value) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "";
		// 동적sql은 실행시점에 사용자가 어떤 선ㅇ택을 하냐에 따라서 sql문이 변경될 ㅣ수 있는 sql문을 의미
		if(column.equals("addr")) {
			sql = "select * from member where addr like ? ";
		} else if (column.equals("name")) {
			sql = "select * from member where name like ? ";
		}
		try {
			// 1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩성공!");
			// 2. 연결하기
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!"+con);
			// 3. SQL문을 실행하기 위한 객체를 만들기
			PreparedStatement ptmt = con.prepareStatement(sql);

			// 4. SQL문 실행하기
			ptmt.setString(1, "%"+value+"%");
			ResultSet rs = ptmt.executeQuery(); 
			
			// 5. 결과처리
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
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


	
