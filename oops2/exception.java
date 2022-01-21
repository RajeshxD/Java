
public class exception {
	
	public static int divide(int a, int b) throws DivideByZeoException {
		
		if(b==0) {
			throw new DivideByZeoException();
		}
		return a / b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			divide(4, 0);
		} catch (DivideByZeoException e) {
			// TODO Auto-generated catch block
			System.out.println("Divide By Zero exception");
//			e.printStackTrace();
		}

	}

}
