package Ex01_API_Lang;

import java.util.HashSet;
import java.util.Random;

public class Ex02_ObjectTest2 {
    public static void main(String[] args) {
        Person p1 = new Person("BTS","서울",901112);
        Person p2 = new Person("BTS","서울",901112);
        // p1과 p2의 객체는 값이 같은 동일한 객체
        // Object클래스의 equals를 사용하지 않고 Person에서 오버라이딩한 메소드가 호출되어
        // 객체의 속성을 비교해서 같은 객체인지 다른 객체인지 리턴
        if(p1.equals(p1)){
            System.out.println("같다.");
        }else{
            System.out.println("다르다.");
        }
        System.out.println(p1);
        System.out.println(p2);
        // hashcode는 java에서 객체의 해시 코드 값을 반환하는 메서드
        // 해시코드는 객체를 식별할 때 사용하는 정수값 - 객체가 할당된 메모리 주소를 기반으로 계산된 값
        // 자료구조에서 객체를 빠르게 찾기 위해서 사용
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        HashSet<Person> set = new HashSet<>();

        set.add(p1);
        set.add(p2);
        System.out.println(set.size());

        // getClass 메소드
        System.out.println(p1.getClass());
        System.out.println(p2.getClass());

        

    }
}
