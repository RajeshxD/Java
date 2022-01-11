import java.util.Scanner;

public class countWords {
	

	public static int printWords(String str) {
		if(str.length()==0) {
			return 0;
		}
		
		int space = 0;
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i) == ' ') {
				space++;
			}
		}
		return space + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str =s.nextLine();
		int ans = printWords(str);
		System.out.println(ans);
	}

}
