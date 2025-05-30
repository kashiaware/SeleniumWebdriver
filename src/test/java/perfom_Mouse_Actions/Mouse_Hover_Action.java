package perfom_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac=driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Mac (1)']"));
	
	Actions act=new Actions(driver);
	
	// Mouse hover action
	act.moveToElement(desktops).moveToElement(mac).click().build().perform();
		

	}

}
