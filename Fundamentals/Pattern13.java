package fundamentals;

import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();


		int i = 1;
		while(i <= n) {
			
			int spaces = 1;			
			while(spaces <= n - i) {
				System.out.print(' ');
				spaces = spaces + 1;
			}
			int num = 1;
			int p = i;
			while(num <= i ) {
				System.out.print(p);
				p = p + 1;
				num = num + 1;
			}
			num = 1;
			p = 2 * i - 2;
			while(num <= i - 1) {
				System.out.print(p);
				p = p - 1;
				num = num + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
