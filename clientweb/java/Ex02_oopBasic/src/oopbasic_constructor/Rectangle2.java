package oopbasic_constructor;

public class Rectangle2 {
    private int width;
    private int length;
    private String color;

    public int area(){
        int area = width*length;
        return area;
    }
    public int perimeter(){
        int perimeter = width*2 + length*2;
        return perimeter;
    }
    public int getWidth() {
        return this.width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
