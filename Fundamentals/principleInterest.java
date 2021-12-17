package fundamentals;

import java.util.Scanner;
public class principleInterest {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		float principle = i.nextFloat();
		float interest = i.nextFloat();
		float rate = i.nextFloat();
		
		float si = (principle * interest * rate)/100;
		
		System.out.println("The Smple Interst is " + si);

	}

}
