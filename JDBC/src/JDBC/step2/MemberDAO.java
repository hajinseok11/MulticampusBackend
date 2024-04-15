package JDBC.step2;

public interface MemberDAO {
	public void insert(String id, String pass, String name, String addr, String info);
	public void Update(String addr, String setAddr);
	public void delete(String deleteId);
	public void select();
	public void login(String id, int pass);
	public void search(String column, String value);
}
