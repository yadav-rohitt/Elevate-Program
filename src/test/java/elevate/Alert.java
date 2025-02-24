package elevate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement Alert = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
		Alert.click();
		driver.switchTo().alert().accept();
		
		String str =driver.findElement(By.xpath("//h4[normalize-space()=\"Result:\"]")).getText();
		
		System.out.println(str);
		
		
		driver.quit();
		
		
	}

}

