package Ex01_JDBC_Exam.dao;

import java.util.Scanner;

import JDBC.step2.MemberDAO;
import JDBC.step2.MemberDAOImpl;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	EmpDAO dao = new EmpDAOImpl();
	public void insertMenu(){
		System.out.println("*******사원등록********");
		System.out.print("사원번호:");
		int empno = key.nextInt();
		System.out.print("성명:");
		String ename = key.next();
		System.out.print("job:");
		String job = key.next();
		System.out.print("매니저아이디:");
		int mgr = key.nextInt();
		System.out.print("부서번호:");
		int deptno = key.nextInt();

		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.insert(empno, ename, job, mgr, deptno);
	}
	public void selectMenu(){
		System.out.println("*******전체사원조회********");
		dao.select();
	}
	
	public void searchMenu(){
		System.out.println("*******사원검색********");
		System.out.print("조회할 사원의 job:");
		String job = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.selectJob(job);
	}
	public void updateMenu() {
		System.out.println("*******사원 수정********");
		int sal = key.nextInt();
		String addr1 = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.selectJob(addr1);
		
	}
	
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("comm이 0인 직원 삭제");
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.delete0();
	}
	public void getInfoMenu(){
		System.out.println("*******사원검색********");
		System.out.print("매니저 아이디:");
		int mgr = key.nextInt();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.selectManager(mgr);
	}
}
