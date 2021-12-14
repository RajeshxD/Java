package fundamentals;

import java.util.Scanner;
public class conditionalRelational {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		if(a > b) {
			System.out.println("First is Greater");
		}
		else if(b > a) {
			System.out.println("second is Greater");
		}
		else {
			System.out.println("Both Equal");
		}
		//		if(a > b) {
		//			System.out.println("First is Greater");
		//		}else {
		//			if(b > a) {
		//				System.out.println("second is Greater");
		//			}
		//			else {
		//				System.out.println("Both Equal");
		//			}
		//		}
	}
}