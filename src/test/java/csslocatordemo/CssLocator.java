package csslocatordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver(); // Ctrl shift o short key
		                   
		// tag id     tag#id
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirt");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt"); //you can remove tag(input) but "# "will be their
		
		// tag class   tag.classname
	
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirt");
		
		// tag attribute   tag[attribute="value"]
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirt");
		
		// tag class attribute  tag.classname[attribute="value"]
		
		
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-Shirt");
	}
	
	

}
