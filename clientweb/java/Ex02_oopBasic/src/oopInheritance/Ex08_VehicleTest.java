package oopInheritance;

public class Ex08_VehicleTest{
    public static void main(String[] args) {
        Bus obj = new Bus();
        obj.tire = new HankookTire();
        Taxi obj2 = new Taxi();
        obj.tire = new KumhoTire();
        obj.run();
        obj2.run();
    }
}
