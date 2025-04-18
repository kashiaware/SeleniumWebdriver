package webdriverMethod;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		// get(url) - opens the url on the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
        Thread.sleep(5000);
	
		// getTitle -returns title of the page
		
		//System.out.println(	driver.getTitle());
	
	
	// getCurrentUrl() -returns URL of the page
		
	//System.out.println(	driver.getCurrentUrl());
	
	// getPagesourse()
	
	//System.out.println(driver.getPageSource());
		
		// getWindowHandle() -returns id of the single Browse window
		
	//String Windowid=driver.getWindowHandle();
	//System.out.println("Window ID:"+Windowid);
		
		//getWindowHandles() -returns ID's of multiple browse window
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> Windowids=driver.getWindowHandles();
		System.out.println(Windowids);
		
	
	
	
	
	
	}
	

}
