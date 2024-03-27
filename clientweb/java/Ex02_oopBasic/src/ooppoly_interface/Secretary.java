package ooppoly_interface;

public class Secretary extends Employee implements Bonus{
    public Secretary(String name, int number, String department, int salary) {
        super(name,number,department,salary);
    }
    public Secretary(){}
    @Override
    public double tax() {
        return getSalary()*0.1;
    }
    @Override
    public void incentive(int pay){
        int incentive = super.getSalary()+(int)(pay*0.8);
        super.setSalary(incentive);
    }
}
