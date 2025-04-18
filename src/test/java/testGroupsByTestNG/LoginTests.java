package testGroupsByTestNG;

import org.testng.annotations.Test;

public class LoginTests {
  @Test(priority=1,groups= {"sanity"})
  public void loginByEmail()
  {
	  System.out.println("This is login by email..");
  }
  
  @Test(priority=2,groups= {"sanity"})
  public void loginByFacebook()
  {
	  System.out.println("This is login by facebook..");
  }
  @Test(priority=3,groups= {"sanity"})
  public void loginByTwitter()
  {
	  System.out.println("This is login by twitter..");
  }
}
