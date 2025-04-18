package options_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headerless_Testing {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headerless=new");   // setting for headless mode of execution

		WebDriver driver=new ChromeDriver(options);

		
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
   driver.quit();


	}

}
