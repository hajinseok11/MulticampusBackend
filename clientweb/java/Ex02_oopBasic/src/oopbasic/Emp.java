package oopbasic;

public class Emp {
    private String id;
    private String name;
    private int baseSalary;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBaseSalary() {
        return this.baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getSalary(double bonus){
        double salary = baseSalary + baseSalary * bonus;
        return salary;
    }
    public String toString(){
        return getName()+"("+getId()+") 사원의 기본급은" + getBaseSalary()+"원 입니다.";
    }

    public Emp(String id, String name, int baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    
}
