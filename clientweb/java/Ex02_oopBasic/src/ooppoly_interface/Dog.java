package ooppoly_interface;

public class Dog extends Animal {

    public Dog(){}
    public Dog(int speed){
        super(speed);
    }
    @Override
    public void run(int hours) {
        distance = distance + hours * speed * 0.5;
        
    }
    
    

    
}
