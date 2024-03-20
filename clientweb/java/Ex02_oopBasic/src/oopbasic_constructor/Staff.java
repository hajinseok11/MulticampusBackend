package oopbasic_constructor;

public class Staff {
    private String name;
    private int age;
    private String dept;

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
    public String getDept() {
        return this.dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void display(){
        System.out.print("이름: "+name+"\t");
        System.out.print("나이: "+age+"\t");
        System.out.println("부서: "+dept);
    }
    public Staff(){
    }
    public Staff(String name,int age,String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
}
