package JDBC.step1;

public class MemberService {
	public void serviceInsert(MemberDAO dao) {
		dao.insert();
	}
	public void serviceSelect(MemberDAO dao) {
		dao.select();
	}
}
