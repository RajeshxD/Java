import java.util.Scanner;

public class fibno {
	
	public static boolean returnFibno(int num) {
		
		int a = 0;
		int b = 1;
		int c;
		while(a<num) {
			c = a + b;
			a = b;
			b = c;
		}
		if(a == num) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		boolean fab = returnFibno(num);
		System.out.println(fab);
		

	}

}
