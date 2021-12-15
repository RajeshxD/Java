package fundamentals;

import java.util.Scanner;
public class Greet {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		String person = name.nextLine();
		System.out.println("Hello My Dear " + person);
		
	}

}
