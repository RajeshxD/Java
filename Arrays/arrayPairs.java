
public class arrayPairs {

	
	public static void printPairs(int[] arr) {
		
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			
			for(int j = i + 1; j < n; j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,4,7,9,8};
		printPairs(arr);
	}

}
