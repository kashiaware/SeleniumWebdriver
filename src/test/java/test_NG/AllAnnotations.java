package test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations {
 
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("This is Before method");  
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("This is After method");    
  }
  @BeforeClass
  public void beforClass() {
	  System.out.println("This is Before class");   
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is After class");   
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is Before test"); 
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is After test");   
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is Bs Suite"); 
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is As Suite"); 
  }
  @Test(priority=1)
  public void tm1()
  {
  	  System.out.println("This is test method1");
  }
  @Test(priority=2)
  public void tm2()
  {
  	  System.out.println("This is test method2");
  }
}
