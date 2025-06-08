package js_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_Demo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//passing the text into inputBox- alternate of sendkeys()
		
		//WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));

		JavascriptExecutor js=(JavascriptExecutor) driver; //javascirpt Executor
		//js.executeScript("arguments[0].setAttribute('value','kashi')",inputBox);
		
		
       // clicking on element -alternate of click
		
		WebElement radioButton=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radioButton);
  
	}

}
