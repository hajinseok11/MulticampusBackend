package oopbasic_constructor;

public class Constructor {
    private String name;
    private String id;
    private String pass;
    private String addr;
    private String telNum;
    private String ssn;
    private String nickName;
    private int point;

    public Constructor(){
        // 생성자 내부에서 객체가 생성될 때 실행될 코드를 정의
        System.out.println("Constructor 기본생성자");
    }
    public Constructor(String name, String id, String pass, String addr){
        // 4개의 매개변수를 각 멤버변수에 할당
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.addr = addr;
        System.out.println("매개변수 4개 생성자");

    }
    // insert용
    public Constructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickName) {
        this(name, id, pass, addr);
        this.telNum = telNum;
        this.ssn = ssn;
        this.nickName = nickName;
        System.out.println("매개변수 7개 생성자");
    }
    // select용
    public Constructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickName, int point) {
        // 생성자 메소드의 호출은 한 가지 종류만 호출
        // this()가 있으면 super()없어야 한다.
        this(name, id, pass, addr, telNum, ssn, nickName);
        this.point = point;
        System.out.println("매개변수 8개 생성자");

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTelNum() {
        return this.telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPoint() {
        return this.point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    

}
