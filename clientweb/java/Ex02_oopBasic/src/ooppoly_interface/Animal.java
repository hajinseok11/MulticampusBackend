package ooppoly_interface;

public abstract class Animal {
    int speed;
    double distance;

    public Animal(){}
    public Animal(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public abstract void run(int hours);

    
}
