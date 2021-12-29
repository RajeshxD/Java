
public class uniqueNumber {


	public static int uniqueArray(int[] arr) {

		int n = arr.length;
		for(int i = 0; i<n; i++) {
			int j;
			for(j = 0; j < n; j++) {
				if(i !=j) {
					if(arr[i]==arr[j]) {
						break;
					}
				}
			}
			if(j == n) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,3,1,6,3,6,2};
		int number = uniqueArray(arr);
		System.out.println(number);

	}

}
