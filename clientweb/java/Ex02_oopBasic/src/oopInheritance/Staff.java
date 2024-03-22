package oopInheritance;

public class Staff extends Person {
    String dept;

    public Staff(){
    }
    public Staff(String name, int age, String dept){
        super(name,age);
        this.dept = dept;
    }
    public String getDept() {
        return this.dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void display(){
        super.display();
        System.out.println(" 부서: "+ dept);
    }
    
}
