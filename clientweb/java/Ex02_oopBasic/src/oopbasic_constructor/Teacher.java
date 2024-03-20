package oopbasic_constructor;

public class Teacher {
    private String name;
    private int age;
    private String subject;

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
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void display(){
        System.out.print("이름: "+ name+"\t");
        System.out.print("나이: "+ age+"\t");
        System.out.println("담당과목: "+ subject);
    }
    public Teacher(){
    }
    public Teacher(String name,int age,String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
}   
