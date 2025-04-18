package webdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();//this will open new window
        
        Thread.sleep(5000);
       // driver.close();  //close single browser window whenever the driver focus
        driver.quit();     //close all the window
	}

}
