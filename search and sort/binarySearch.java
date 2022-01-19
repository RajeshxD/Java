package searchAndSort;

public class binarySearch {

	public static int sortedBinary(int arr[], int x) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid] == x) {
				return mid;
			} else if(arr[mid] < x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7};
		int x = 7;
		int array = sortedBinary(arr,x);
		System.out.println(array);
	}

}
