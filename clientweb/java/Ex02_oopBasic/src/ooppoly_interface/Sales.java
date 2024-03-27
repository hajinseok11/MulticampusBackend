package ooppoly_interface;

public class Sales extends Employee implements Bonus {
    public Sales(){}
    public Sales(String name, int number, String department, int salary) {
        super(name,number,department,salary);
    }
    @Override
    public void incentive(int pay) {
        int incentive = super.getSalary()+(int)(pay*1.2);
        setSalary(incentive);
    }
    @Override
    public double tax() {
        double tax = (getSalary())*0.13;
        return tax;
    }
}
