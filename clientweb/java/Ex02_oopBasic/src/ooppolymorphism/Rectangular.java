package ooppolymorphism;

public class Rectangular extends Shape {
	private double width;
	private double height;
	public Rectangular() {
		
	}
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.height = hight;
	}
	@Override
	public void calculationArea() {
		area = width * height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return height;
	}
	public void setHight(double hight) {
		this.height = hight;
	}
}
