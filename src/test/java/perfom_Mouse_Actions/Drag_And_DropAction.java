package perfom_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		
	 WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
	 WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
	 // Drag and Drop1 action
	 
		act.dragAndDrop(rome, italy).perform();		
		
		//div[@id='DHTMLgoodies_dragableElement2']
		
		 WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));		
		 WebElement united_state=driver.findElement(By.xpath("//div[@id='box103']"));	
		 
		 act.dragAndDrop(washington, united_state).perform();
	}

}
