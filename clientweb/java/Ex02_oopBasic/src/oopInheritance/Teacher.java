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
        System.out.print("이름: "+ getName());
        System.out.print("나이: "+ getAge());
        System.out.println("담당과목: "+ subject);
    }
    public Teacher(){
    }
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject = subject;
    }
}   
