package excep;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File myFile = new File ("c://Users//newfile.txt");
		
		System.out.println(myFile.exists());
		Scanner myScanner = new Scanner (myFile);
		
		while (myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			System.out.println(line);
		}
		
		

	}

}
