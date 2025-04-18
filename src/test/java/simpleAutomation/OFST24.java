package simpleAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OFST24 {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ofs.etelej.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='columns small-12 medium-8']//div[3]//label[1]//input[1]")).sendKeys("UBS");
		

	}

}
