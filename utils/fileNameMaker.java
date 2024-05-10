package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fileNameMaker {



      public String FileNameForLogin(String u,String p)

      {
      String filename;
      
      LocalDateTime  now = LocalDateTime.now();
      System.out.println("before formatting: " + now);
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      filename = u + "_"+p+"_"+now.format(format)+"jpg";
      return(filename);
      }
}