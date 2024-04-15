package JDBC.step1;

public class Main {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberSpringDAOImpl dao = new MemberSpringDAOImpl();
		service.serviceInsert(dao);
		
		service.serviceSelect(dao);
	}

}
