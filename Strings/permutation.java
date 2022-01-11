/*
Problem Description: Given two strings, check if they are permutations of each
other. Return true or false.

Sample Input:
abac
aacb

Sample Output:
true

*/

public class permutation {

	public static boolean checkPermutation(String str1, String str2) {
		
		int n = str1.length();
		int m = str2.length();
		
		if(n!=m) {
			return false;
		}
	int frequency[] = new int[256];
	
	for(int i = 0; i < 256; i++) {
		frequency[i] = 0;
	}
	for(int i = 0; i < n; i++) {
		char ch = str1.charAt(i);
		++frequency[ch];
	}
	for(int i = 0; i < m; i++) {
		char ch = str2.charAt(i);
		--frequency[ch];
	}
	for(int i = 0; i < 256; i++) {
		if(frequency[i] != 0) {
			return false;
		}
	}
	return true;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abac";
		String str2 = "aacb";
//		boolean ans = checkPermutation(str1,str2);
		System.out.println(checkPermutation(str1,str2));
	}

}
