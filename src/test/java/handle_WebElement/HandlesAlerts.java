package handle_WebElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesAlerts {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		
		
		// Normal Alert With OK Button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept(); if perfom single action use this
		
Alert myalert=driver.switchTo().alert(); //and if you want to get text detail then use this
System.out.println(myalert.getText());
myalert.accept();*/
		
		// Conformation Alert - Ok & Cancel
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); // close Alert using ok button
		
		driver.switchTo().alert().dismiss(); // close alert using cancel button
		
		// prompt Alert - I/P box,OK & Cancel Button
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		
	Alert promptAlert= driver.switchTo().alert();
	promptAlert.sendKeys("welcome");
	promptAlert.accept();
	}

}
