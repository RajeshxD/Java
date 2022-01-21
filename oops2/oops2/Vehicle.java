package oops2;

public class Vehicle {

	private String color;
	protected int MaxSpeed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Vehicle(int MaxSpeed) {
		System.out.println("Vehicle's Constructor");
		this.MaxSpeed = MaxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle " + " Color " + color + " MaxSpeed " + MaxSpeed);
	}
}
