package elevate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement file = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		file.sendKeys("C:\\Users\\rohya\\Downloads\\ms.png");
		
		WebElement UploadBtn = driver.findElement(By.xpath("//input[@id=\"file-submit\"]"));
		UploadBtn.click();
		
		System.out.println("File Uploaded Successfully");
		driver.quit();

	}

}
