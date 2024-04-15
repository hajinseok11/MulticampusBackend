package Ex01_JDBC_Exam.dao;

public interface EmpDAO {
	public void insert(int empno, String ename, String job, int mgr,int deptno);
	public void select();
	public void selectJob(String job);
	public void updateSal(int sal, String ename);
	public void delete0();
	public void selectManager(int mgr);

}
