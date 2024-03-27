package Ex01_API_Lang;

import java.util.Objects;

// Objects클래스의 기능을 확인
public class Ex03_ObjectsTest {
    public static void main(String[] args) {
        Person p1 = new Person("BTS","서울",901112);
        Person p2 = new Person("BTS","서울",901112);
        System.out.println(Objects.equals(p1, p2));
        // 객체의 속성들을 이용해서 hashcode를 생성
        System.out.println(Objects.hash(p1.getAddr(),p1.getName(),p1.getAge()));
        System.out.println(Objects.hash(p2.getAddr(),p2.getName(),p2.getAge()));
    }
}
