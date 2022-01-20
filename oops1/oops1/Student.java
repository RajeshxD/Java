package oops1;

public class Student {

	
	//Default is accessible within the same class, another class in same package.
	//public can access with same class, another class in same package and different package
	//private can access with in class
	public String name;
	final private int rollNumber; 
	double cgpa;
	public final static double CONVERSIONFACTOR = 0.95;
	private static int numStudents; //static will be shared by all object that belongs to class
	
	public Student(String name) {
		this.name = name;
		numStudents++;
		this.rollNumber = numStudents;
	}
//	public Student(String name) {
//		this.name = name;
//		this.rollNumber = numStudents;
//	}
	public Student() {
		name = "lol";
		this.rollNumber = numStudents;
	}
	public static int getNumStudent() {
		return numStudents;
	}
	public void print() {
		System.out.println(name + " " +rollNumber);
	}
	
	public int getRollNumber() {
		return this.rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}
	}
}
