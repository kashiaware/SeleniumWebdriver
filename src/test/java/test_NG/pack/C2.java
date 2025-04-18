package test_NG.pack;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class C2 {
  @Test
  public void xyz() 
  {
	  System.out.println("this is xyz from c2 ");
  }
  @AfterMethod
  public void at()
  {
	  System.out.println("this is After method ");
  }

}
