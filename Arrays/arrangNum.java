import java.util.Scanner;

public class arrangNum {
	
	public static void arraNum(int arr[], int n) {
		int start= 0; 
		int end = n-1;
		int value = 1; 
		while(start <= end) {
			if(value % 2 == 1) {
				arr[start] = value;
				value += 1;
				start += 1;
			} else {
				arr[end] = value;
				value += 1;
				end += 1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		
		
		arraNum(arr,n);

	}

}
