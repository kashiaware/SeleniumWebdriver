package perfom_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Action {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		
		
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.manage().window().maximize();
	
	 
	 // Switch to frame
	 
	 driver.switchTo().frame("iframeResult");
		
		
	 WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
	 WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
	 WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();  // clear box 1
		box1.sendKeys("welcome");
		
		//  Double click action on the button
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		// validation : box2 should contain "welcome"
		
		String text=box2.getAttribute("value");
		System.out.println("capture value is:"+ text);
		
		if(text.equals("welcome"))
		{
			System.out.println("Text Copied...");
		}else
		{
			System.out.println("Text not  Copied...");
		}

	}

}
 