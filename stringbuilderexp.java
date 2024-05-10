package excep;

public class stringbuilderexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str = new StringBuilder("welcome to UST");
		
		System.out.println(str);
		
		str.append("AND global");
 
		System.out.println(str);
		
		str.delete(0,0);
		System.out.println(str);
		
		str.insert(8, "hyderabad");
		System.out.println(str);
		
		str.replace(4, 6, "HYD");
		System.out.println(str);
		
		System.out.println(str.substring(0, 4));
		
	}

}
