package testGroupsByTestNG;

import org.testng.annotations.Test;

public class SignUpTests {
  
 
	  @Test(priority=1,groups= {"regression"})
	  public void signupByEmail()
	  {
		  System.out.println("This is signup by email..");
	  }
	  
	  @Test(priority=2,groups= {"regression"})
	  public void signupByFacebook()
	  {
		  System.out.println("This is signup by facebook..");
	  }
	  @Test(priority=3,groups= {"regression"})
	  public void signByTwitter()
	  {
		  System.out.println("This is signup by twitter..");
	  }
}
