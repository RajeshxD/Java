
public class reverseEachWord {

	public static String reverseWord(String str) {
		String ans ="";
		int currentWordStart = 0;
		int i = 0;
		for(; i < str.length(); i++) {
			if(str.charAt(i)== ' ') {
				int currentWordEnd = i - 1;
				String reversedWord = "";
				for(int j = currentWordStart; j <= currentWordEnd; j++) {
					reversedWord = str.charAt(j) + reversedWord;
				}
				
				ans += reversedWord + " ";
				currentWordStart = i + 1;
			}
		}
		int currentWordEnd = i - 1;
		String reversedWord = "";
		for(int j = currentWordStart; j <= currentWordEnd; j++) {
			reversedWord = str.charAt(j) + reversedWord;
		}
		
		ans += reversedWord;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc def ghi";
		System.out.println(reverseWord(str));
	}

}
