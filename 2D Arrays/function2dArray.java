import java.util.Scanner;

public class function2dArray {

	public static void print2dArray(int[][] arr) {
		int rows = arr.length;
		int colom = arr[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<colom; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows = s.nextInt();
		System.out.println("Enter Colomns");
		int colom = s.nextInt();
		int [][] arr = new int [rows][colom];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < colom; j++) {
				System.out.println("Enter the "+ i +" row" + j + " colom" );
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] input = takeInput();
		print2dArray(input);
	}
}
