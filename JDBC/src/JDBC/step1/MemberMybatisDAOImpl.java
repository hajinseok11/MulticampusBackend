package JDBC.step1;
// Mybatis로 member테이블에 엑세스하는 기능 - member테이블에 CRUD하는 기능을 수행하는 클래스
public class MemberMybatisDAOImpl implements MemberDAO{
	public void insert() {
		System.out.println("Mybatis로 insert하기");
	}
	public void select() {
		System.out.println("Mybatis로 select하기");
	}
	@Override
	public void update() {
		System.out.println("Mybatis로 update하기");
	}
	@Override
	public void delete() {
		System.out.println("Mybatis로 delete하기");
	}
}
