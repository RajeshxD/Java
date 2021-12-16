package fundamentals;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		int b = i.nextInt();
		
		
		if(a > b) {
			System.out.println(a + " is greater than " + b);
		} else {
			System.out.println(b + " is greater than " + a);
		}

	}

}
