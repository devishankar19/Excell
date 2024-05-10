package inher;

public class child extends mom implements dad,grandpa {

	public static void main(String[] args) {
		
		System.out.println("Child's height is " + (dad.height + 10) + " Eyecolour inherited from mom is " + eyecolour);
		System.out.println("Large feet from grandpa " + (shoeSize -1));
		
		
	}
	
}
