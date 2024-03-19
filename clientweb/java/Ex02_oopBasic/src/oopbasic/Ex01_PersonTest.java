package oopbasic;
// 사용자 정의 클래스인 Person클래스를 사용(테스트)하기 위한 클래스
public class Ex01_PersonTest {
    public static void main(String[] args) {
        // 멤버변수들은 기본값을 갖는다 => 기본값은 배열과 동일
        Person p1 = new Person();
        System.out.println("성명: " + p1.name);
        System.out.println("주소: " + p1.addr);
        System.out.println("나이: " + p1.age);

        p1.name = "RM";
        p1.age = 30;
        p1.addr = "서울";
        System.out.println("================");
        System.out.println("성명: " + p1.name);
        System.out.println("주소: " + p1.addr);
        System.out.println("나이: " + p1.age);

        Person p2 = new Person();
        p2.name = "슈가";
        p2.age = 32;
        p2.addr = "대구";
        System.out.println("================");
        System.out.println("성명: " + p2.name);
        System.out.println("주소: " + p2.addr);
        System.out.println("나이: " + p2.age);

        Person p3 = null; // 참조하는 객체가 없다는 의미, 참조형 변수의 일반적인 초기값
        System.out.println("p1=> "+p1);
        System.out.println("p2=> "+p2);
        System.out.println("p3=> "+p3);
        p3 = new Person();

    }
}
