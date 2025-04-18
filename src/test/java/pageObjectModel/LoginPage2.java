package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// Using Page Factory
public class LoginPage2
{
    
	WebDriver driver;
	
	// Constuctor
	LoginPage2(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements (driver,this);  //Mandatory
	}

	//Locator
	
	//@FindBy(xpath="//input[@placeholder='Username']") 
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']") 
	WebElement but_login;
	
	
	@FindBy(tagName="a")
	List<WebElement> links; //@FindBy for locating multiple web element
	
	//Action Methods
	
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	
	public void setPassword(String pwd)
	{
	txt_password.sendKeys(pwd);
	}
	public void clicklogin()
	{
	but_login.click();
	}
}
