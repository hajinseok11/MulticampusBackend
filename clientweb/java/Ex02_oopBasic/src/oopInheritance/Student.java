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
        super.display();
        System.out.println(" 학번: "+ id);
    }
    public Student(){
    }
    public Student(String name, int age, int id) {
        super(name,age);
        this.id = id;
    }
    
}
