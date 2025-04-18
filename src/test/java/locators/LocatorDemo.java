package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// name locater
		
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		// id locator
		
	//boolean logoDisplyastatus=	driver.findElement(By.id("logo")).isDisplayed();
	//System.out.println(logoDisplyastatus);
		
		// link text & partial link text
		
		//driver.findElement(By.linkText("Tablets")).click();
		
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerlinks.size());
		
		// tag name
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images:"+images.size());
		

	}

}
