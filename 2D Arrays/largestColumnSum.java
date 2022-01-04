import java.util.Scanner;

public class largestColumnSum {
	public static int larColSum(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int largest = Integer.MIN_VALUE;
		for(int j = 0; j <cols;j++) {
			int sum = 0;
			for(int i = 0; i < rows; i++) {
				sum += arr[i][j];
			}
			if(sum > largest) {
				largest = sum;
			}
		}
		return largest;
	}

	public static int[][] takeInput() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of rows ");
		int row = s.nextInt();
		System.out.println("Enter the Number of coloms ");
		int cols = s.nextInt();
		int [][] arr = new int [row][cols]; 
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < cols;j++) {
				System.out.println("Enter the "+ i +" row " + j + " cols");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] input = takeInput();
		int largest = larColSum(input);
		System.out.println(largest);
	}

}
