package Ex01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
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
		System.out.println("아이디: ");
		String id = key.nextLine();
		
		System.out.println("패스워드: ");
		String pass = key.nextLine();
		
		obj.login(id,pass);
	}
	
	public void login(String id, String pass) {
		String sql = "select * from member where id ='" +id + "' and pass ='" + pass +"'";  // 로그인 성공
		String url = "jdbc:oracle:thin:@49.142.60.208:1521:xe";
		String user = "scott";
		String password = "tiger";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
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
	
	
	


