package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest
{

	WebDriver driver;
  @BeforeClass
  public void setup() 
  {
	driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
	  driver.manage().window().maximize();
	  
	  
  }
  @Test(priority=1)
  public void testlogin() throws InterruptedException
  {
	LoginPage lp=new LoginPage(driver);
	lp.setUserName("Admin");
	lp.setPassword("admin123");
	lp.clicklogin();
	
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
  }
 
  
  @AfterClass
  public void tearDown()
  {
 driver.quit();
  }


}







