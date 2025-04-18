package test_NG.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class C3 {
  @Test
  public void pqr() 
  {
	  System.out.println("This is pqr from c3");
  }
  @BeforeSuite
  public void bS()
  {
	  System.out.println("This is Before Suite");  
  }

  @AfterSuite
  public void aS()
  {
	  System.out.println("This is After Suite");
  }

}
