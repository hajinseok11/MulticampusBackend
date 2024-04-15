package Ex01_JDBC_Exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.step2.DBUtil;

public class EmpDAOImpl implements EmpDAO {
	@Override
	public void insert(int empno, String ename, String job, int mgr, int deptno) {
		String sql = "insert into emp values(?,?,?,?,sysdate,800,0,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, empno);
			ptmt.setString(2, ename);
			ptmt.setString(3, job);
			ptmt.setInt(4, mgr);
			ptmt.setInt(5, deptno);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입성공!!");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}

	@Override
	public void select() {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from emp";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getInt("sal")+"\t");
				System.out.print(rs.getInt("comm")+"\t");
				System.out.println(rs.getInt("deptno"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs,ptmt,con);
		}
	}

	@Override
	public void selectJob(String job) {
		String sql = "select * from emp where job = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			System.out.println("드라이버로딩성공!");
			con = DBUtil.getConnect();
			System.out.println("연결성공"+con);
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			ptmt.setString(1, job);
			
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 조회성공!");		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}

	@Override
	public void updateSal(int sal, String ename) {
		String sql = "update emp ";
		sql = sql+ "set ? + 500 ";
		sql = sql+ "where job = ? ";
		Connection con = null;
		PreparedStatement ptmt = null;
		try {
			System.out.println("드라이버로딩성공!");
			con = DBUtil.getConnect();
			System.out.println("연결성공"+con);
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, sal);
			ptmt.setString(2, ename);
			
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 수정성공!");		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}

	@Override
	public void delete0() {
		Connection con = null;
		PreparedStatement ptmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete emp where comm = 0 ");
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제성공!");		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}

	@Override
	public void selectManager(int mgr) {
		String sql = "select * from emp where mgr = ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			System.out.println("드라이버로딩성공!");
			con = DBUtil.getConnect();
			System.out.println("연결성공"+con);
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			ptmt.setInt(1, mgr);
			
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 수정성공!");		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt,con);
		}
	}

}
