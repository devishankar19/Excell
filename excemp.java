package excep;

public class excemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		int j=2;
		
		try {
			int result = i/j;
			System.out.println("result is :" + result);
			
		}
		
		
			
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			System.out.println("finally executing");
		}
		
	}

}
