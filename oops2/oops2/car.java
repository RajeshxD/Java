package oops2;

public class car extends Vehicle {
	
	int NumDoors;
	public car(int numDoors,int Maxspeed) {
		super(Maxspeed);
		System.out.println("Cars Constructor");
		this.NumDoors = numDoors;
	}
	public void print() {
		super.print();
		System.out.println("Car " + " numDoors " + NumDoors);
	}

}
