package oopInheritance;

public class Teacher extends Person {
    String subject;

    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void display(){
        super.display();
        System.out.println(" 담당과목: "+ subject);
    }
    public Teacher(){
    }
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject = subject;
    }
}   
