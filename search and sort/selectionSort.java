package searchAndSort;

public class selectionSort {

	public static void sorted(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			//insert elements at ith position
			
			int mini = arr[i];
			int minIndex = i;
			
			for(int j = i; j <arr.length; j++) {
				//Finding minimum elements among jth position
				if(mini > arr[j]) {
					mini = arr[j];
					minIndex = j;
				}
			}
			//swap the elements
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	public static void printArray(int arr[]) {
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,13,4,1,3,6,28};
		sorted(arr);
		printArray(arr);
	}

}
