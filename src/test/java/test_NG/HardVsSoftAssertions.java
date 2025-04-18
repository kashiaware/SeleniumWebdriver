package test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	//@Test
	void hardAssertion()
	{
		System.out.println("....testing");
		System.out.println("....testing");
		
		Assert.assertEquals(1,2);   // HardAssertion
		
		System.out.println("....testing");
		System.out.println("....testing");
	}
    @Test
	void softAssertion()
	{
	
		System.out.println("....testing");
		System.out.println("....testing");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(01, 02);   // soft Assertion
		
		System.out.println("....testing");
		System.out.println("....testing");
		
		sa.assertAll();   // mandatory in soft assertion
	}
	
}
