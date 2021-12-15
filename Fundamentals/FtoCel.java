package fundamentals;

import java.util.Scanner;
public class FtoCel {

	public static void main(String[] args) {
		
		int s,e,w;
		
		Scanner input = new Scanner(System.in);
		
		s = input.nextInt();
		e = input.nextInt();
		w = input.nextInt();

		int f = s;
		while(f <= e) {
			
			int c = (int) ((5.0/9) * (f - 32));
			System.out.println(f + " " + c);
			f = f + w;
		}
	}

}
