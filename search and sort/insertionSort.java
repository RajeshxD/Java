package searchAndSort;

public class insertionSort {
	
	public static void sorted(int arr[]) {
		
		int i = 1;
		int temp;
		while(i<arr.length) {
			temp = arr[i];
			int j = i - 1;
			while(j >= 0) {
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
				j -= 1;
			}
			arr[j+1] = temp;
			i+=1;
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
