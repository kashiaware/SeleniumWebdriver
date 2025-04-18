package handle_webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1)find total no of rows in table
		
	//List<WebElement>tRows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));  // multiple table use this
		//System.out.println("Total No of rows :"+ tRows.size()); //7
		
	int tRows=driver.findElements(By.tagName("tr")).size(); // single table in a page then use this
	//System.out.println("Total No of rows :"+ tRows);
		
		// 2) find total no of columns in table
		
	int tColums=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();  //  for Multiple table
		//int tColums=driver.findElements(By.tagName("th")).size();  // for single table
	System.out.println("Total No of Columns :"+ tColums);
	
	// 3) Read data from Specific rows and column (ex: 5th row and 1st column)
	
 String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
 System.out.println("The data in 5th row and 1st column is:" + data);


   String subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[3]")).getText(); // data from 3rd row and 3rd column
   System.out.println("The data in 5th row and 1st column is:" + subject);
   
   // 4) Read the data from all the rows and column
   // use nested for loop
   
  // System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
  /* for(int r=2;r<=tRows;r++)
   {
	  for(int c=1;c<=tColums;c++) 
	  {
		  String allData=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		  System.out.print(allData+"\t");

	  System.out.println();
   }*/
   
	// 5)Print Book name whose  author is Mukesh//table[@name='BookTable']//tr[7]//td[2]
   
 /*  for(int r=2;r<=tRows;r++)
	   
   {
	   String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();  
	   
	   if(authorName.equals("Mukesh"))
	   {
		  String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText(); 
		  System.out.println(bookName+"\t"+authorName );
		   
	   }
	   
   }*/
	
   // 6) Find total price of all books
   
   int total=0;
 for(int r=2;r<=tRows;r++)
	   
   {
	   String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();  
	   total=total+Integer.parseInt(price);
   }   
	
 System.out.println("Total price of the book:"+total);	
	
	
	}

}
