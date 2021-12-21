
public class duplicateNumber {

	public static int sameNumber(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			int j;
			for(j=0;j<n;j++) {
				if(i!=j && arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return Integer.MAX_VALUE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,7,2,5,4,7,1,3,6};
		
		int lar = sameNumber(arr);
		System.out.println(lar);

	}

}
