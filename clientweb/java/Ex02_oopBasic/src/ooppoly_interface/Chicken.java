package ooppoly_interface;

public class Chicken extends Animal implements Cheatable{
    public Chicken(int speed){
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance = distance + hours * speed;
        // setDistance((getDistance()+hours*speed));
        
    }

    @Override
    public void fly() {
        speed = speed*2;

    }
    
}
