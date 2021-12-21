package fundamentals;

import java.util.Scanner;
public class whilStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		char ch = s.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z' ){
			System.out.println("1");
		}else if(ch >= 'a' && ch <= 'z'){
			System.out.println("0");
		}else {
			System.out.println(-1);
		}
		
		
//		int i=0;
//		while(i<10) {
//			i = i+1;
//			System.out.println(i);
//			i=i+1;
//		}

	}

}
