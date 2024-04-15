package Ex01_JDBC;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

// Statement(정적SQL)를 이용해서 insert문 실행하기
public class Ex02_PreparedInsertTest {
	public static void main(String[] args) {
		Ex02_PreparedInsertTest obj = new Ex02_PreparedInsertTest();
		Scanner key = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = key.next();
		
		System.out.print("패스워드: ");  
		String pass = key.next();
		
		System.out.print("성명: ");
		String name = key.next();
		
		System.out.print("주소: ");
		String addr = key.next();
		
		System.out.print("기타정보: ");
		String info = key.next();
		obj.insert(id, pass, name, addr, info);
	}
	public void insert(String id, String pass, String name, String addr, String info) {
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into member values(?,?,?,?,sysdate,20000,?)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩성공!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!"+con);
			// 1. sql문이 미리 파싱될 수 있도록 PreparedStatement객체 생성
			PreparedStatement ptmt = con.prepareStatement(sql);
			// 2. ?에 값을 세팅
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, info);
			
			//3. sql실행 - sql문을 전달하지 않는다.
			int result = ptmt.executeUpdate();
			
			System.out.println(result + "개 행 삽입성공!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


	
