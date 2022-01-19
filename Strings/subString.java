
public class subString {
	public static void substring(String str) {
		int n = str.length();
		for(int start = 0; start < n; start++) {
			for(int end = start; end < n; end++) {
				System.out.println(str.substring(start, end+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pqrs";
		substring(str);
	}

}
