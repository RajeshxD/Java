
public class fToC {
	
	public static void farToCel(int start,int end, int step) {
		
		int currentValue = start;
		while(currentValue <= end) {
			int fahrenheitValue = (int)(5.0/9) * (currentValue - 32);
			
			System.out.println(currentValue+ " " + fahrenheitValue);
			currentValue += step;
			
		}
		
	}
	public static void main(String[] args) {
		int start = 0;
		int end = 100;
		int step = 20;
		
		farToCel(start, end, step);
		
	}

}
