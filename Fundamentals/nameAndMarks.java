package fundamentals;

import java.util.Scanner;

public class nameAndMarks {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char str = s.next().charAt(0);
		int m1, m2, m3;
		
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		
		int avg = (m1 + m2 + m3) / 3;
		
		System.out.println(str);
		System.out.println(avg);
		

	}

}
