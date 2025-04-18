package perfom_Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		// min slider
		
		 WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("default location of the slider: "+min_slider.getLocation()); //(59,294)=(x,y)
	 act.dragAndDropBy(min_slider, 100, 294).perform();
		System.out.println("After moving location of the slider: "+min_slider.getLocation());//(160,294)
		
		 //max slider
		 
		// WebElement max_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		 
		// System.out.println("default location of the max slider: "+max_slider.getLocation());//(544,294)=(x,y)
		//act.dragAndDropBy(max_slider, -150, 0).perform();
	//	System.out.println("After moving location of the max slider: "+max_slider.getLocation());//(394,294)

	}

}

