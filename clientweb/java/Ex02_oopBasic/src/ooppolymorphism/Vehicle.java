package ooppolymorphism;

public class Vehicle{
    // has a 관계
    Tire tire;
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}
class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달립니다");
    }
}
class Taxi extends Vehicle{
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}
