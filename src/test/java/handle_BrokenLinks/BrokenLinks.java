package handle_BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		// capture all the links from website
		
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	System.out.println("Total number of links:"+ links.size());
	int totalNOofBrobenlink=0;
	
	for(WebElement linkElement:links)
	{
		String hrefattValue=linkElement.getAttribute("href");
		
		if(hrefattValue==null || hrefattValue.isEmpty())
		{
			System.out.println("href attribute value is null or empaty. so Not possible to check ");
			continue;
		}
		
		// hit URL to the server
		try {
		URL linkURL=new URL(hrefattValue); //Convert href value from string to URL format
		HttpURLConnection conn=(HttpURLConnection)linkURL.openConnection(); // open connection to the server
		conn.connect(); // connect to server and send request to the server
		
		if(conn.getResponseCode()>=400)
		{
			System.out.println(hrefattValue+"=====>Broken link");
			totalNOofBrobenlink++;
		}
		else
		{
			System.out.println(hrefattValue+"=====>Not a Broken link");
		}
		}
		
		catch(Exception e)
		{
			
		}
	}
	System.out.println("Total no of broken link:"+totalNOofBrobenlink);
	}

}
