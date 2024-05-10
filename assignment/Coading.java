package assignment;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.BeforeClass;

public class Coading {
	
	public boolean actualresult;
	public static String actualgreet;
	public static String expectedgreet;
	public boolean result;
	
	@BeforeClass
	public static void readpropertyfile()
	
	{
	    Properties p = new Properties();
	    FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\eclipse-workspace\assignment\src\test");
	    P.load(fis);
	    
	}
	

}
