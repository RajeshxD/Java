

import java.util.Scanner;
public class arraySum {
	
	
	public static int sumArray(int[] arr) {
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,9,8,9};
		int sum = sumArray(arr);
		System.out.println(sum);
		
	}

}
