package handle_webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pagination_Table {

	public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
	// 1)find total no of pages		
List<WebElement>total_pages=driver.findElements(By.xpath("//div[@class='main-outer']//li"));
System.out.println(total_pages.size());
	      
 //  2)find total no of rows

  int rows= driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
  System.out.println("Toatl no of Rows:"+rows);
  
  // 3)find total no of column
  
  int colm= driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
  System.out.println("Toatl no of Rows:"+colm);
  
  // 4) read data from all rows and column
  
   for(int r=1;r<=rows;r++)
  {
	  for(int c=1;c<=colm;c++) 
	  {
		  List<WebElement>ch=driver.findElements(By.xpath("//tbody/tr["+r+"]/td["+c+"]//input"));
		  for(WebElement checkbox:ch)
		  {
 checkbox.click();	


		  String allData=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]")).getText();
		  System.out.print(allData+"\t");

	  System.out.println();
  }
  
	  }     

	}

}}
