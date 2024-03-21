package oopInheritance;

public class Student extends Person {
    int id;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void display(){
        System.out.print("이름: "+ getName());
        System.out.print("나이: "+ getAge());
        System.out.println("학번: "+ id);
    }
    public Student(){
    }
    public Student(String name, int age, int id) {
        super(name,age);
        this.id = id;
    }
    
}
