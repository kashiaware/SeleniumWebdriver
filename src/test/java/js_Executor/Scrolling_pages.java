package js_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_pages {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver; //javascirpt Executor
		
		//1) scroll page down by pixel number
		
		//js.executeScript("window.scrollBy(0,1500)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));//1500
		
		//2) scroll the page till element is visible
		
	/*WebElement ele=	driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
	js.executeScript("arguments[0].scrollIntoView();",ele);
	System.out.println(js.executeScript("return window.pageYOffset;"));	// pxel 2264*/
		
		//3) scroll the page till end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));//2392
		Thread.sleep(5000);
		//4) scrolling  upto initial position
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
	}

}
