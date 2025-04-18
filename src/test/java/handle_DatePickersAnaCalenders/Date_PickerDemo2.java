package handle_DatePickersAnaCalenders;

import java.sql.Driver;
import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_PickerDemo2 {

	// user defined function for converting month from string ---->Month
	
	static Month convertMonth(String month){
		
		
		HashMap<String, Month> monthMap=new HashMap<String, Month>();
		
		monthMap.put("january",Month.JANUARY);
		monthMap.put("february",Month.FEBRUARY);
		monthMap.put("march",Month.MARCH);
		monthMap.put("april",Month.APRIL);
		monthMap.put("may",Month.MAY);
		monthMap.put("june",Month.JUNE);
		monthMap.put("jully",Month.JULY);
		monthMap.put("august",Month.AUGUST);
		monthMap.put("september",Month.SEPTEMBER);
		monthMap.put("octomber",Month.OCTOBER);
		monthMap.put("november",Month.NOVEMBER);
		monthMap.put("december",Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		
		if(vmonth==null) {
			System.out.println("Invalid Month....");
		}
		return vmonth;
	}	
	
	static void Selectdate(WebDriver driver,String requiredYear,String requiredMonth,String requiredDate )
	{
	

	
		// select year
		
	WebElement yearDropDown=	driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
	Select selectYear=new Select( yearDropDown);
	selectYear.selectByContainsVisibleText(requiredYear);
	
	// select month
	
	String disPlayMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).getText();
	
	 //  convert requiredMonth  and  disPlayMonth into Month object
	
	while(true)  
	{
     Month expectedMonth= convertMonth(requiredMonth);
     Month currentMonth= convertMonth (disPlayMonth);
     
     // compare
     
     int result=expectedMonth.compareTo(currentMonth);
     
     // 0 equal to month
     // <0 past month
     // >0 future month
     
     if(result>0)
    {
    	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();	 
     }else if(result<0)
     {
    	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    	 
     }
     else
     {
    	break; 
     }
     
     
	}
	
	// select date
	
List<WebElement>allDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));

for(WebElement dt:allDate)
{
	if(dt.getText().equals(requiredDate))
	{
		dt.click();
		break;
	}
}
	}

public static void main(String[] args) {
	
	  WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
      // input DOB
		String requiredYear="2025",requiredMonth="June",requiredDate="15";
		
	driver.findElement(By.xpath("//input[@id='txtDate']")).click(); // click on date picker
	
	Selectdate(driver,requiredYear,requiredMonth,requiredDate);
		
	}

}
