package excep;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class readpropfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\Excemption Handling\\config.properties");
		
		for (Entry<Object,Object> e :p.entrySet())
		{
			System.out.println(e);
		}
	//	p.load(fis);
		
	//	String bgcolor = p.getProperty("bgcolor");
	//	System.out.println(bgcolor);
		
	//	String dateformate = p.getProperty("dateformate");
	//	System.out.println(dateformate);
		
	//	String gmail = p.getProperty("gmail");
	//	System.out.println(gmail);
		
		
		

	}

}
