package Ex01_API_Lang;

import java.util.Date;
import java.util.Random;
import java.util.ArrayList;

public class Ex01_ObjectTest {
    public static void main(String[] args) {
        // equals는 하위클래스에서 객체의 속성을 비교해서 같은 객체인지 여부를 boolean으로 리턴하도록 재정의해서 주로 사용
        Object obj1 = new Object();
        Object obj2 = new Object();
        Person p1 = new Person("BTS","서울",30);
        Person p2 = new Person("BTS","서울",30);
        
        if(obj1==obj2){
            System.out.println("같다.");
        }else{
            System.out.println("다르다.");
        }

        if(obj1.equals(obj2)){
            System.out.println("같다.");
        }else{
            System.out.println("다르다.");
        }
        // Object클래스의 메소드
        // toString메소드가 객체가 갖는 기본 메소드 - 기본메소드는 생략이 가능
        System.out.println(obj1);
        System.out.println(obj1.toString());
        System.out.println(obj2);
        System.out.println(obj2.toString());
        
        if(p1.equals(p2)){
            System.out.println("같다.");
        }else{
            System.out.println("다르다.");
        }
        System.out.println(p1);
        System.out.println(p2);

        String str = new String("java");
        System.out.println(str);
        System.out.println(str.toString());

        Date date = new Date(10);
        System.out.println(date);

        ArrayList<String> list = new ArrayList<>();
        list.add("자바");
        list.add("서블릿");
        System.out.println(list);

        Random rand = new Random();
        System.out.println(rand);
        
    }
}
