	package testNgListener;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class AutomationTets {
	
	WebDriver driver;
  @BeforeClass
  public void setup() throws InterruptedException
  {
	driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/ ");
	  driver.manage().window().maximize();
	  
	  
  }
  @Test(priority=1)
  public void testlogo() throws InterruptedException
  {
	boolean status=  driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).isDisplayed();
	Assert.assertEquals(status, true);
	 Thread.sleep(2000);
  }
  @Test(priority=2)
  public void testURL()
  {
	  Assert.assertEquals(driver.getCurrentUrl(),"https://testautomationpractice.blogspot/");
  }
  @Test(priority=3,dependsOnMethods={"testURL"})
  public void tesTtitle()
  {
	  Assert.assertEquals(driver.getTitle(),"Automation Testing Practice");
  }
  
  @AfterClass
  public void tearDown()
  {
 driver.quit();
  }


}





