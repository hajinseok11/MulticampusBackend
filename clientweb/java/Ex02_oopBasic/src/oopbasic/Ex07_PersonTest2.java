package oopbasic;
// 사용자 정의 클래스인 Person클래스를 사용(테스트)하기 위한 클래스
public class Ex07_PersonTest2 {
    public static void main(String[] args) {
        // 멤버변수들은 기본값을 갖는다 => 기본값은 배열과 동일
        Person2 p1 = new Person2();
        p1.setName("RM");
        p1.setAge(30);
        p1.setAddr("서울");
        System.out.println("================");
        System.out.println("성명: " + p1.getName());
        System.out.println("주소: " + p1.getAge());
        System.out.println("나이: " + p1.getAddr());

        Person2 p2 = new Person2();
        p2.setName("슈가");
        p2.setAge(32);
        p2.setAddr("대구");
        System.out.println("================");
        System.out.println("성명: " + p2.getName());
        System.out.println("주소: " + p2.getAddr());
        System.out.println("나이: " + p2.getAge());

    }
}
