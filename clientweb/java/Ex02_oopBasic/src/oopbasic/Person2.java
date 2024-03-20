package oopbasic;
// 자바의 특징에 맞게 클래스를 정의
// 클래스를 정의할 때 멤버변수(클래스의 속성, 구성요소, 클래스에서 다루는 데이터)는
// private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고 public메소드를 통해서 접근할 수 있도록 구현한다.
// encapsulation(캡슐화를)를 위해서 private으로 정보를 은닉하고 메소드의 통신으로 데이터를 엑세스 해야한다.

public class Person2 {
    // 정보를 은닉
    private String name;
    private String addr;
    private int age;    
    // 모든 멤버변수가 private으로 선언되어 있으므로 값을 선언하는 메소드와 값을 가져오기 위한 메소드가 정의되어야 한다.
    // 값을 설정하기 위한 메소드 : setter메소드
    // 메소드명 : set + 값이 저장될 멤버변수의 첫 글자는 대문자로 변경해서 연결
    // ex) name변수에 값을 설정하는 메소드를 정의
    //     setName
    public void setName(String name){
        // 값에 대한 검증 - null이거나 공백이 아닌 값을 설정하도록
        // 매개변수로 전달된 입력 값이 유효한지 - 패턴(정규표현식) : 이메일 형식, 패스워드 조건에 대한 만족 여부
        if (name != null | name.length() > 0){
        this.name = name;
        }
    // 현재작업중인 객체 = 지역변수(매개변수)
    }
    public void setAddr(String addr){
        this.addr = addr;
    }
    public void setAge(int age){
        this.age = age;
    }
    // 객체의 멤버변수에 저장된 값을 호출한 곳으로 넘겨줄 메소드 : getter메소드
    // 메소드명 : get + 값이 저장될 멤버변수의 첫글자를 대문자로 변경해서 연결
    // ex) name변수의 값을 가져올 수 있도록 메소드를 정의
    // getName
    public String getName(){
        return name;
    }
    public String getAddr(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
