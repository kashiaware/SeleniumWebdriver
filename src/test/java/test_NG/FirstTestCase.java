package test_NG;

import org.testng.annotations.Test;

public class FirstTestCase {
	

@Test(priority=10)
	void openapp()
	{
		System.out.println("opening application");
	}
	
@Test()
	void login()
	{
		System.out.println("login to application");
	}
	
	@Test(priority=30)
	void logout()
	{
		System.out.println("logout from application");
	}
	
	
}

