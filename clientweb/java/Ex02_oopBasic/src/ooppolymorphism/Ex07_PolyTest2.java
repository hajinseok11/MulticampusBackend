package ooppolymorphism;

abstract class Person{
    public abstract void job();
       
}
class Student extends Person{
    public void job(){
        System.out.println("학생은 공부하기");
    }
}

class Staff extends Person{
    public void job(){
        System.out.println("직원은 업무보기");
    }
}

class SecurityManager extends Person{
    public void job(){
        System.out.println("보안을 책임집니다");
    }
}

class Teacher extends Person{
    public void job(){
        System.out.println("선생님은 가르치기");
    }
}

public class Ex07_PolyTest2 {
    public static void main(String[] args) {
        Student s = new Student();
        Staff s2 = new Staff();
        Teacher t = new Teacher();
        SecurityManager sm = new SecurityManager();
        run(s);
        run(s2);
        run(t);
        run(sm);
    }
    public static void run(Person obj){
        System.out.println("*************************************");
        obj.job();
        System.out.println("*************************************");
    }

    public static void run(Staff obj){
        System.out.println("*************************************");
        obj.job();
        System.out.println("*************************************");
    }
    public static void run(Teacher obj){
        System.out.println("*************************************");
        obj.job();
        System.out.println("*************************************");
    }
}

