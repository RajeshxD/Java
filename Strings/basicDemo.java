
public class basicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("abc ");
		str.setCharAt(3, 'd');
		str.append("efg");
		System.out.println(str+ " " + str.length());

		
		
//		String str = "abc";
//		String str2 = new String("abc");
		
//		String str2 = "";
//		System.out.println(str2.length());
//		System.out.println(str.charAt(2));
//		System.out.println(str + str2);
//		System.out.println(str.equals(str2));
//		System.out.println(str.substring(5));
	}

}
