package excep;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Userpwd {

	private static String[] userdetails;

	public static void main(String[] args) throws FileNotFoundException {
				// TODO Auto-generated method stub
		
		try {
			
			 File myFile = new File ("c://Users//newfile.txt");
			
			System.out.println(myFile.exists());
			Scanner myScanner = new Scanner (myFile);
			
			while (myScanner.hasNextLine()) {
				String line = myScanner.nextLine();
				//assignment split line and create usrname and pwd result console
				
			
				userdetails = line.split(",");
				
				for(int i=0,"i< userdetails.length;i++)
				
				
					
				}
			}
			

			
			
			
			
			
			
				
			
				
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				[]
		
		
		
	}

}
