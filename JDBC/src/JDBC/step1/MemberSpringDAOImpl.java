package JDBC.step1;

public class MemberSpringDAOImpl implements MemberDAO {
	public void insert() {
		System.out.println("Spring로 insert하기");
	}
	public void select() {
		System.out.println("Spring로 select하기");
	}
	@Override
	public void update() {
		System.out.println("Spring로 update하기");
	}
	@Override
	public void delete() {
		System.out.println("Spring로 delete하기");
	}
}
