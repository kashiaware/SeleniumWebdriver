package js_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript_ExecutorMethods {

	public static void main(String[] args) {
	
		//System.setProperty("Webdriver.chrome.driver", "Driver path");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// 1) JavaScript Method for sendkey
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement SearchBox=driver.findElement(By.xpath("//textarea[@name='q']"));
		js.executeScript("arguments[0].value='India'",SearchBox);
		
		// 2) JavaScript method for click
		WebElement googaleSearch=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::input[@value='Google Search']"));
		js.executeScript("arguments[0].click()", googaleSearch );
		
		// 3) navigate to another window using Javascript Executor
		js.executeScript("window.location='https://testautomationpractice.blogspot.com/'");
		
		// 4) url Print using Javascript Executor
		String url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		// 5) Title Print using Javascript Executor
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		// 5) Domain Print using Javascript Executor
				String domain=js.executeScript("return document.domain;").toString();
				System.out.println(domain
						);
				

	}

}
