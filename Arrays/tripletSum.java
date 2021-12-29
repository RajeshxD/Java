
public class tripletSum {
	public static int pairingArray(int arr[], int x) {
		int n = arr.length;
		int numPair = 0;
		for(int i=0;i<n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						numPair += 1;
					}
				}
			}
		}
		return numPair;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7};
		int x = 12;
		int total = pairingArray(arr,x);
		System.out.println(total);
	}

}
