package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		
		// x path with single element
		
		//driver.findElement(By.xpath( "//input[@placeholder='Search']")).sendKeys("Tshirt");
		
		// x path with multiple attributes
		
		//driver.findElement(By.xpath( "//input[@placeholder='Search'][@placeholder='Search']")).sendKeys("Tshirt");
		
		// x path with 'and' operator
		
		//driver.findElement(By.xpath( "//input[@placeholder='Search'and @placeholder='Search']")).sendKeys("Tshirt");
		
		// x path with 'OR' operator
		
		//driver.findElement(By.xpath( "//input[@placeholder='Search'or @placeholder='Search']")).sendKeys("Tshirt");
		
		// x path with text() - inner text
		
		// driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		// boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(value);
		
		// x path with contains()
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");
		
		
		// x path with starts -with()
		
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");
		
		// chained x path (combination of absolute x path and relative x path
		
		boolean displaystatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(displaystatus);
	}

}
