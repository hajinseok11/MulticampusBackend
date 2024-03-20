package test;

import oopbasic.Person;

public class test1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        // p1.age = 20; // age는 default 접근제어자이므로 같은 패키지에 만들어진 클래스만 접근할 수 있다.
        p1.name = "하진석";

    }
}
