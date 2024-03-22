package oopInheritance;
/**
 * final
 * 변수     -> 상수로 정의
 * 메소드   -> 오버라이딩 할 수 없는 메소드
 * 클래스   -> 상속할 수 없는 클래스
 * 
 */
class A{
    public void test(){
        // 일반 기능의 메소드 - 하위 클래스에서 상속해서 변경해야 하는 메소드
    }
    public final void login(String pass){
        System.out.println("부모클래스의 중요한 메소드 - 인증하고 엑세스 하기");
    }
}
class B extends A{
    // public void login(String pass){ // 오류발생
    //     System.out.println("인증하지 않고 엑세스하는 코드로 수정");
    // }
}


public class Ex09_FinalTest {
    public static final int CODE = 100;
    public void test(){
        // CODE = 1000; 상수는 값을 재할당 할 수 없다.
    }
    public static void main(String[] args) {
        
    }
    
}
