package testNGTestcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterValue {
	
  @Parameters({"sp"})
  @Test
  public void testSingleString(String ps) {
	  System.out.println("Invoked testString " + ps);
	  assert "prashan".equals(ps);
	  
  }
	     
      @Parameters({"ps"})
	  @Test
	  public void test1SingleString(String sp) {
		  System.out.println("Invoked testString " + sp);
		  assert "psps".equals(sp);
	}
}
