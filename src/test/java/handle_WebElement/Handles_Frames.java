package handle_WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles_Frames {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
	
		// frame 1
		
	WebElement frame1=	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);  // passed frame as a web element //switch to frame 1
    driver.findElement(By.xpath(" //input[@name='mytext1']")).sendKeys("Welcome");
    
    driver.switchTo().defaultContent(); // go back to main  page
    
     // frame 2
    
   WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
   driver.switchTo().frame(frame2);
   driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");

   driver.switchTo().defaultContent(); // go back to page
   
   // frame 3
   
   WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
   driver.switchTo().frame(frame3);
   driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
   
   // inner frame - part of frame 3
   
   driver.switchTo().frame(0);  //switching to frame using index
  // driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
   
   // using java script Executor
 WebElement rdButton=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("arguments[0].click();",rdButton );
   
   
   driver.switchTo().defaultContent();

	}
//
}


