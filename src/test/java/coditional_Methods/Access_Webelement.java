package coditional_Methods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Access_Webelement {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// isDisplayed()
		
//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//System.out.println("Display status of logo:"+logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//	System.out.println("Display status:"+status);	
		
			// isEnabled()
			
			//boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
			//System.out.println("Enabled status:"+status);
		
		// is selected()
		
	WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	System.out.println("Before selection........");
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	
	System.out.println("After selection........");
	
	female_rd.click();
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	
	
		
	}

}
