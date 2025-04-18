package handle_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_HiddenDropdown {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		// Login steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// clicking on PIM
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		// clicked on drop down
		
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		
		// select single option
		
driver.findElement(By.xpath(null)).click();
	}

}
