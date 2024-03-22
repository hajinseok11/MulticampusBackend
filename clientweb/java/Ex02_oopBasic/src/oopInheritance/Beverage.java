package oopInheritance;

public class Beverage {
    private String type;
    private int price;

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Beverage(){}
    public Beverage(String type, int price) {
        this.type = type;
        this.price = price;
    }
}
class Coffee extends Beverage{
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void print (){
        System.out.println("타입: "+getType()+ " 가격 " + getPrice()+" 이름 " + getName()  );
    }
    public Coffee(){}
    public Coffee(String type, int price,String name) {
        super(type,price);
        this.name = name;
    }




}