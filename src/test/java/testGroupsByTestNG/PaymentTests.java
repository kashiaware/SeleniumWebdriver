package testGroupsByTestNG;

import org.testng.annotations.Test;

public class PaymentTests {
  @Test(priority=1,groups= {"sanity","regression","functional"})
  public void paymentinrupees()
  {
	  System.out.println("This is payment in rupees...");
  }
  @Test(priority=1,groups= {"sanity","regression","functional"})
  public void paymentindollers()
  {
	  System.out.println("This is payment in dollers...");
  }
}
