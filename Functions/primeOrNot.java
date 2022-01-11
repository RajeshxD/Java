import java.util.Scanner;
public class primeOrNot {
	
//	Method 1
	public static boolean primeNumber(int n) {
		int div = 2;
		while(div <= n/2) {
			if(n % 2 == 0) {
				return false;
			}
			div = div + 1;
		}
		return true;
	}
	
//	method 2
	public static boolean primeNumber2(int n) {
		int div = 2;
		boolean isPrime= true;
		while(div <= n/2) {
			if(n % 2 == 0) {
				isPrime=false;
				break;
			}
			div = div + 1;
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = primeNumber2(n);
		System.out.println(isPrime);
	 
	}

}
