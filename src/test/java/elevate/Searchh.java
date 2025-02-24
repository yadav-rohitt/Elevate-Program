package elevate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(20000);
	
	
	WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("Electronics");
	
	WebElement Btn = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	Btn.click();
	}

}
