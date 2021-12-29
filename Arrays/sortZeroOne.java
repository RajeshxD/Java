
public class sortZeroOne {
	public static void sorting(int arr[]) {
		int nextZero = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				int temp = arr[nextZero];
				arr[nextZero] = arr[i];
				arr[i] = temp;
				nextZero += 1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {0,1,1,0,1,0,1};
		sorting(arr);
	}

}
