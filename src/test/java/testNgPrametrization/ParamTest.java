package testNgPrametrization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	WebDriver driver;
  @BeforeClass
  @Parameters({"browser"})
  public void setup(String br) throws InterruptedException
  {
	 switch(br.toLowerCase())
	 {
		 case "chrome" : driver=new ChromeDriver();break;
		 case "edge" : driver=new EdgeDriver();break;
		 case "firefox" : driver=new FirefoxDriver();break;
		 default:System.out.println("Invalid browser");return;//return exit from entire method and rest of test not executed
	 }
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("   <parameter name=\"browser\" value=\"chrome\"/>");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }
  @Test(priority=1)
  public void testlogo()
  {
	boolean status=  driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).isDisplayed();
	Assert.assertEquals(status, true);
  }

  @Test(priority=2)
  public void tesTtitle()
  {
	  Assert.assertEquals(driver.getTitle(),"Automation Testing Practice");
  }
  @Test(priority=3)
  public void testURL()
  {
	  Assert.assertEquals(driver.getCurrentUrl(),"https://testautomationpractice.blogspot.com/");
  }
  @AfterClass
  public void tearDown()
  {
 driver.quit();
  }



}
