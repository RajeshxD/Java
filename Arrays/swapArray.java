
public class swapArray {

	public static void swapAlternate(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1; i +=2) {
			int temp = arr[i];
			int temp1 = arr[i + 1];
			arr[i+1]=temp;
			arr[i]=temp1;
			System.out.print("(" + arr[i] + "," + arr[i+1] + ")");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {9, 3, 6, 12, 4, 32, 5, 11, 19};
		swapAlternate(arr);
	}

}
