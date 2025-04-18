package test_NG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyMethod {
  @Test(priority=1)
  public void openapp()
  {
	  Assert.assertTrue(false);
  }
  
  @Test(priority=2,dependsOnMethods= {"openapp"})
  public void login()
  {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=3,dependsOnMethods= {"login"})
  public void search()
  {
	  Assert.assertTrue(true);
  }
  @Test(priority=4,dependsOnMethods= {"login"})
  public void logout()
  {
	  Assert.assertTrue(true);
  }
  
}
