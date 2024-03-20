package oopbasic_constructor;

public class Constructor {
    private String name;
    private String id;
    private String pass;
    private String addr;
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

}
