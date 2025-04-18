package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page Object class without using Page Factoryw
public class LoginPage 
{
	WebDriver driver;
	
	// Constuctor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//Locator
	

	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By but_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action Methods
	
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	
	public void setPassword(String pwd)
	{
	driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	public void clicklogin()
	{
	driver.findElement(but_login_loc).click();
	}
}
