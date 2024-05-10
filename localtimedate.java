package excep;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localtimedate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
		String FormateDateTime = now.format(Format);
		System.out.println("After Formatting: " + FormateDateTime);
		
	}

}
