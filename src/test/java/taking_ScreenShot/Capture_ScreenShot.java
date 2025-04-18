package taking_ScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_ScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
       
		//1) full page Screenshot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		/*File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File("C:\\java program\\seleniumwebdriver\\Seleniumwebdriver\\screenshot\\fullpage.png");//entire path
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");// dynamic path
		sourcefile.renameTo(targetfile); // copy sourcefile to targetfile*/
		
		//2) capture the screenshot of the specific section
		
	/*WebElement	featurePrdcts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
	File sourcefile=featurePrdcts.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\featurePrdcts.png");// dynamic path
	sourcefile.renameTo(targetfile); // copy sourcefile to targetfile*/	
	
	//3) capture the screenshot of webelement
	
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	
	File sourcefile=logo.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");// dynamic path
	sourcefile.renameTo(targetfile); // copy sourcefile to targetfile*/	
	
	driver.quit();
	
	}

}
