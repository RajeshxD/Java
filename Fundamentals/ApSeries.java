package fundamentals;

import java.util.Scanner;
public class ApSeries {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		int x = 1;
		
		while(i <= n) {
			int num = 3 * x + 2;
			if(x % 4 != 0){
				System.out.println(num);
				i++;
			}
			x++;
		}

	}

}
