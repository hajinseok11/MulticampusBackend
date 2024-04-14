package Ex01_JDBC;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Statement(정적SQL)를 이용해서 insert문 실행하기
public class Ex02_PreparedInsertTest {
	public static void main(String[] args) {
		Ex02_PreparedInsertTest obj = new Ex02_PreparedInsertTest();
		Scanner key = new Scanner(System.in);
		System.out.println("아이디: ");
		String id = key.next();
		
		System.out.println("패스워드: ");  
		String pass = key.next();
		
		System.out.println("성명: ");
		String name = key.next();
		
		System.out.println("주소: ");
		String addr = key.next();
		
		System.out.println("기타정보: ");
		String info = key.next();
		obj.insert(id, pass, name, addr, info);
	}
	public void insert(String id, String pass, String name, String addr, String info) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into member values('"+id+"','"+pass+"','"+name+"','"+addr
				+"',sysdate,10000,'"+info+"')";
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


	
