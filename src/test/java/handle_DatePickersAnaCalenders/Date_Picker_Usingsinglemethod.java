package handle_DatePickersAnaCalenders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Usingsinglemethod {

	// select future date
	static void selectFutureDate(WebDriver driver,String year,String month,String date)
	{
		 
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		
		}
	

		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for( WebElement dt:allDates)
		{
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
			
		}
	
	
	}
	

	// select Past date
	static void selectPastDate(WebDriver driver,String year,String month,String date)
	{
		 
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
		
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		
		}
	

		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for( WebElement dt:allDates)
		{
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
			
		}
	
	
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/"); 
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker
		
		//selectFutureDate( driver,"2026","May","31");
		selectPastDate( driver,"2023","June","19");

	}


}