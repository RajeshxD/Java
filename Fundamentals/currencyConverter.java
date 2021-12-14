package fundamentals;

import java.util.Scanner;

public class currencyConverter {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		int inr = i.nextInt();
		float dollar = 0.0134392798f;
		
		float currency = inr * dollar;
		
		System.out.println(currency);

	}

}
