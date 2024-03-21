package oopbasic_constructor;

import oopbasic.Person;

public class Ex01_ConstructorTest {
    public static void main(String[] args) {
        Constructor obj4 = new Constructor("석진","jin","1234","서울","010","901111",
        "곰돌이",10000);
        System.out.println(obj4.getName() + "," + obj4.getAddr()+","+obj4.getId()+","+obj4.getPass()+obj4.getNickName()+obj4.getPoint());
        System.out.println("---------------------------------------------------------------");
        
        Person p = new Person();
        Constructor obj = new Constructor();
        System.out.println(obj);

        Constructor obj2 = new Constructor();
        obj2.setName("석진");
        obj2.setAddr("서울");
        obj2.setId("jin");
        obj2.setPass("1234");

        System.out.println(obj2.getName() + "," + obj2.getAddr()+","+obj2.getId()+","+obj2.getPass());

        // 생성자를 이용해서 멤버변수를 초기화
        Constructor obj3 = new Constructor("석진","jin","1234","서울");
        System.out.println(obj3.getName() + "," + obj3.getAddr()+","+obj3.getId()+","+obj3.getPass());
    }
}
