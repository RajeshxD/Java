
public class palindromString {
	
	public static boolean palindrome(String str) {
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			++left;
			--right;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcba";
		boolean reversedString = palindrome(str);
		System.out.println(reversedString);
	}

}
