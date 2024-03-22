package oopInheritance;

public class Person {
    private String name;
    private int age;
    public Person(){   
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.print("이름 : "+getName()+" 나이: "+getAge());
    }

}
