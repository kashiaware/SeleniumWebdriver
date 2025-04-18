package webdriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Methods_implicitwait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();//this will open new window
        
        
       // driver.close();  //close single browser window whenever the driver focus
      //  driver.quit();     //close all the win
	}

}
