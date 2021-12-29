
public class pairSum {
	
	public static int pairingArray(int arr[], int x) {
		int n = arr.length;
		int numPair = 0;
		for(int i=0;i<n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i]+arr[j]==x) {
					numPair += 1;
				}
			}
		}
		return numPair;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,8,10,5,-2,5};
		int x = 10;
		int total = pairingArray(arr,x);
		System.out.println(total);

	}

}
