package test_NG.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class C1 {
  @Test
  public void abc()
  {
	System.out.println("This is abc from c1");  
  }
  @BeforeMethod
  public void bt() 
  {
	  System.out.println("This is Before method");    
  }

}
