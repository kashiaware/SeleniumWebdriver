package handle_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenKart {

	public static void main(String[] args)
	{
		
		
		  WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			
	    // Add item to cart
			
	WebElement product=	driver.findElement(By.xpath("//div[3]//div[3]//button[1]"));
	product.click();
	
	// Procced to checkout
	
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
	
	// Apply promo code and place ordrer
	
	driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
	
	// Choose Country
	
	  WebElement drpCountryEle=driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
      Select drpCountry=new  Select(drpCountryEle);
    
      drpCountry.selectByContainsVisibleText("India");
      
      // Agree Term and Conditions
      
      driver.findElement(By.xpath("//input[@type='checkbox']")).click();
      
      // procced
      
      driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
      
      System.out.println("Thank you, Your Ordre place Succefully ");
      
      driver.quit();
	
}


}
