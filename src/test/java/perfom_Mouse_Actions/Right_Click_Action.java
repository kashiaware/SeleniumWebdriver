package perfom_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Action {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
	WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
	Actions act=new Actions(driver);
	
	// right click action
	
	act.contextClick(button).perform();

	// right click on copy
	
	driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
    Thread.sleep(5000);
    
 // close alert box
 	driver.switchTo().alert().accept();
 	
	}

}
