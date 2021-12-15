package fundamentals;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int a = 0;
		int b = 1;
		
		for(int i = 0; i < n; i++) {
//			int a = 0;
			int c = a + b;
			System.out.println(a);
			a = b;
			b = c;
		}

	}

}
