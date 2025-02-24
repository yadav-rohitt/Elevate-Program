package elevate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// username for login
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username.sendKeys("Admin");
		
		//
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("admin123");
		
		
		WebElement Button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
		Button.click();	
		
		Thread.sleep(3000);
		//dropdown
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		
		WebElement LogoutBtn = driver.findElement(By.xpath("//a[normalize-space()=\"Logout\"]"));
		LogoutBtn.click();
	}

}
