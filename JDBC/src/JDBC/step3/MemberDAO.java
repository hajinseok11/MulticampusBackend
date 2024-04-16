package JDBC.step3;

import java.util.List;

public interface MemberDAO {
	public void insert(String id, String pass, String name, String addr, String info);
	public int insert(MemberDTO user);
	public void Update(String info, String addr, String id);
	public void Update(MemberDTO updateUser);
	public void delete(String deleteId);
	public List<MemberDTO> select();
	public MemberDTO login(String id, String pass);
	public List<MemberDTO> search(String column, String value);
	public MemberDTO findById(String id);
}
