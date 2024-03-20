package oopbasic_constructor;

public class Student {
    private String name;
    private int age;
    private int id;

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
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.print("이름: "+ name+"\t");
        System.out.print("나이: "+ age+"\t");
        System.out.println("학번: "+ id);
    }
    public Student(){
    }

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
}
