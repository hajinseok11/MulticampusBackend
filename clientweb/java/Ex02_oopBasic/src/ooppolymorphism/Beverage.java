package ooppolymorphism;

public abstract class Beverage {
    public String name; 
    protected int price;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Beverage(String name){
        this.name = name;
    }

    public Beverage(){}

    public abstract void calcPrice();

    public void print(){
        System.out.println(name +" 이며, 가격은 "+ price);
    }


}
