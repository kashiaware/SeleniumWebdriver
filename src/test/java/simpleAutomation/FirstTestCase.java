package simpleAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
/*Test case
 1)Launch browser
 2)open URL https://demo.opencart.com
 3)Validate title should be "your store"
 4)close Browser
 */
public class FirstTestCase {

	public static void main(String[] args) {
	
		//1) Launch browser(Chrome)
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//open URL https://demo.open.com/
		driver.get("https://demo.opencart.com");
		
		// Validate title should be "Your Store"
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
		System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Faild ");
		}
		
		
		// Close the browser
		
		//driver.close();
		//driver.quit();
	}

}
