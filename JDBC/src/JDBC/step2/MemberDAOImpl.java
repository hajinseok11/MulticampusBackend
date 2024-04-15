package JDBC.step2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// insert, delete, update, select login, search
public class MemberDAOImpl implements MemberDAO {
	public void insert(String id, String pass, String name, String addr, String info) {
		String sql = "insert into member values(?,?,?,?,sysdate,20000,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			ptmt.setString(3, name);
			ptmt.setString(4, addr);
			ptmt.setString(5, info);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공!!");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}
	public void Update(String addr, String setAddr) {
		String sql = "update member ";
		sql = sql+ "set addr =? ";
		sql = sql+ "where addr =? ";
		Connection con = null;
		PreparedStatement ptmt = null;
		try {
			System.out.println("드라이버로딩성공!");
			con = DBUtil.getConnect();
			System.out.println("연결성공"+con);
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, setAddr);
			ptmt.setString(2, addr);
			
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 수정성공!");		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}
	public void delete(String deleteId) {
		Connection con = null;
		PreparedStatement ptmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete member where id =? ");
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setString(1,deleteId);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제성공!");		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}
	public void select() {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from member";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.print(rs.getInt("point")+"\t");
				System.out.println(rs.getString(7));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs,ptmt,con);
		}
	}
	public void login(String id, int pass) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from member where id = ? and pass = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, pass);
			rs = ptmt.executeQuery();
			System.out.println(rs);
			if(rs.next()) {
				System.out.print(rs.getString("name")+"님 로그인 성공");
			}else {
				System.out.println("로그인실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs,ptmt,con);
		}
	}
	public void search(String column, String value) {
		String sql = "";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		// 동적sql은 실행시점에 사용자가 어떤 선ㅇ택을 하냐에 따라서 sql문이 변경될 ㅣ수 있는 sql문을 의미
		if(column.equals("addr")) {
			sql = "select * from member where addr like ? ";
		} else if (column.equals("name")) {
			sql = "select * from member where name like ? ";
		}
		try {
			// 2. 연결하기
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			// 4. SQL문 실행하기
			ptmt.setString(1, "%"+value+"%");
			rs = ptmt.executeQuery(); 
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
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs,ptmt,con);
		}
	}
}
