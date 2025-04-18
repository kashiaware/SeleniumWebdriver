package options_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitiMode {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://testautomationpractice.blogspot.com/");

		// Validate title should be "Automation Testing Practice"
		String act_title=driver.getTitle();

		if(act_title.equals("Automation Testing Practice"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Faild ");
		}
  // driver.quit();

	}

}
