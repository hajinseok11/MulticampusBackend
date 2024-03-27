package ooppoly_interface;

public abstract class Employee {
    private String name;
    private int number;
    private String department;
    private int salary;

    public Employee(){}
    public Employee(String name, int number, String department, int salary) {
        this.name = name;
        this.number = number;
        this.department = department;
        this.salary = salary;
    }
    public double tax(){
        return tax();
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
