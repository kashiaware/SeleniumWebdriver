package options_Class;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtentionsAtRunTime {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		//File file=new File("C:\\SeleniumWebDriver\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		File file=new File("C:\\SeleniumWebDriver\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		

	}

}
