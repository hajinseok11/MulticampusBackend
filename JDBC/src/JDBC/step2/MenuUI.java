package JDBC.step2;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("성명:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("기타:");
		String info = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.insert(id, pass, name, addr, info);
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("변경할 주소:");
		String addr1 = key.next();
		System.out.print("조건으로 검색할 주소:");
		String addr2 = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.Update(addr2, addr1);

	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("삭제할id:");
		String id = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.delete(id);

	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 MemberDAO의 메소드를 호출하세요
		dao.search("addr", addr);

	}
	
	
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서MemberDAO의 메소드를 호출하세요 - 전체사원조회
		dao.select();

	}
}


















