package webdriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
   WebElement textusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
         textusername.sendKeys("Admin");
       
         //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

}
