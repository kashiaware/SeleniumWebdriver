package webdriverMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
        
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();//this will open new window
        
        Set<String> windowIDs=driver.getWindowHandles();
        
        for(String winid:windowIDs)
        {
        	String title=driver.switchTo().window(winid).getTitle();
        	System.out.println(title);
        	
        	if(title.equals("Human Resources Management Software | OrangeHRM") || title.equals("some other title"))
        	{
        		driver.close();
        	}
        }
        

	}

}
