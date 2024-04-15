package Ex01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 실습
 * id와 pass가 일치하면 __님 로그인 성공 메시지 출력하기
 * id와 pass가 일치하지 않으면 로그인 실패 
 */
public class Ex09_PreparedLoginTest {
	public static void main(String[] args) {
		Ex09_PreparedLoginTest obj = new Ex09_PreparedLoginTest();
		Scanner key = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = key.nextLine();
		
		System.out.print("패스워드: ");
		int pass = key.nextInt();
		
		obj.login(id,pass);
		key.close();
	}
	
	public void login(String id, int pass) {
		String sql = "select * from member where id = ? and pass = ?";  // 로그인 성공
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, pass);
			ResultSet rs = ptmt.executeQuery();
			System.out.println(rs);
			if(rs.next()) {
				System.out.print(rs.getString("name")+"님 로그인 성공");
			}else {
				System.out.println("로그인실패");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
		
		
	}
	
	
	


