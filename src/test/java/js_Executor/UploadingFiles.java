package js_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFiles {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Windows\\addins\\FXSEXT.ecf");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("FXSEXT.ecf"))
				{
			System.out.println("File is succefully uploaded");
			
				}else
				{
					System.out.println("File not uploaded");
						
				}*/
		
		// multiple files uploaded
		
		String file1="C:\\Windows\\addins\\FXSEXT.ecf";
		String file2=	"C:\\Users\\ADMIN\\Documents";	
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	int	noOfFiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	//validaton 1-Number of files
	if(noOfFiles==2)
	{
		System.out.println(" All Files are uploaded");
	}
	else
	{
		
	System.out.println("Files are not uploaded");	
	}
	
	// validate files name
	
	if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("FXSEXT.ecf")&&
			driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Documents"))
			{
		System.out.println("File names matching...");
			}
	else
	{
		System.out.println("Files are name not  matching...");	
	}
	
	}

}
