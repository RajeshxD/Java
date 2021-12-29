
public class linerSearch {
	

	public static int arraySize(int arr[],int x) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		
		int arr[] ={2,13,4,1,3,6,28};
		int x = 3;
		int find = arraySize(arr,x);
		System.out.println(find);
	
	}
}
