/* For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc" 
*/


public class removeDuplicate {
	
	public static String duplicated(String str) {
		int n = str.length();
		if(n==0) {
			return str;
		}
		String answer = "";
		int startIndex = 0;
		while(startIndex < n) {
			char uniqueChar = str.charAt(startIndex);
			int nextUniqueCharIdex = startIndex + 1;
			while(nextUniqueCharIdex < n && str.charAt(nextUniqueCharIdex) == uniqueChar) {
				nextUniqueCharIdex += 1;
			}
			answer += uniqueChar;
			startIndex = nextUniqueCharIdex;	
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbcca";
		System.out.println(duplicated(str));
	}

}
