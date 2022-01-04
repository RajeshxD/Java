import java.util.Scanner;

public class rowWiseSum {
	
	public static void rowSum(int[][] mat) {
		int nRows = mat.length;
		if(nRows==0) {
			return;
		}
		
		int mCols = mat[0].length;
		for(int i = 0; i < nRows; i++) {
			int rowSum = 0;
			for(int j = 0; j < mCols;j++) {
				rowSum += mat[i][j];
			}
			System.out.print(rowSum + " ");
		}
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
		rowSum(input);
	}

}
