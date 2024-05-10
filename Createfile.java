package excep;

import java.io.FileWriter;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter myWriter = new FileWriter("c://Users//newfile.txt");
		myWriter.write("hellow"+"\n\r");
		
		
		
			myWriter.append("Adding a new line"+"\n\r");
		
		
		
			myWriter.append("test another line"+"\n\r");
		
		myWriter.flush();

		System.out.println("completed successfully");
	}
	
}
