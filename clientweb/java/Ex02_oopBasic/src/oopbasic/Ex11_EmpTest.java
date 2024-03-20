package oopbasic;

public class Ex11_EmpTest {
    public static void main(String[] args) {
        Emp info = new Emp("12345","홍길동",50000);
        System.out.println(info.toString());
        System.out.println("봉급 = "+info.getSalary(30));
    }
}
