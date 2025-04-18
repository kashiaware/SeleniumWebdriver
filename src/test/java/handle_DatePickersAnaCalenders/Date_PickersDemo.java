package handle_DatePickersAnaCalenders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_PickersDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// 1) switch to frame
		
		driver.switchTo().frame(0);
		
		// method 1 : using sendkeys()
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/05/2025"); //mm/yy/yyyy
		
		// method 2: using date picker
		// expected data 
		String year="2026";
		String month="April";
		String date="10";
		 
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		// select the date
		
		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for( WebElement dt:allDates)
		{
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
			
		}
		

	}

}
