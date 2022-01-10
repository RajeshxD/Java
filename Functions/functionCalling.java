
public class functionCalling {
	
	public static int functionCall(int a, int b) {
		
		int result = a + b;
		return result;
	}
	public static int increment(int n) {
		n++;
//		System.out.println("Increment " + n);
		return n;
	}
	public static void main(String[] args) {
		
		int n = 10;
		n = increment(n);
		System.out.println(n);
//		int a = 10;
//		int b = 5;
//		int sum = functionCall(a,b);
//		
//		System.out.println(sum);
		
	}

}
