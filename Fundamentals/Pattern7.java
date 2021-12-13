package fundamentals;

import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int p = 1;
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print('*');
				j = j + 1;
				p = p + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
