package elevate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Enter the name in form
		WebElement Name = driver.findElement(By.xpath("(//input[@id='nf-field-17'])[1]"));
		Name.sendKeys("Rohit");
		
		//Enter the surname in form
		WebElement Surname = driver.findElement(By.xpath("//input[@id=\"nf-field-18\"]"));
		Surname.sendKeys("Yadav");
		
		//Enter the email 
		WebElement Email = driver.findElement(By.xpath("//input[@id=\"nf-field-19\"]"));
		Email.sendKeys("rohyadav18@gmail.com");
		
		//Enter the phone num
		WebElement PhoneNum = driver.findElement(By.xpath("//input[@id=\"nf-field-20\"]"));
		PhoneNum.sendKeys("9370125772");
		
		//select course by dropdown
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id=\"nf-field-22\"]")));
		dropdown.selectByContainsVisibleText("Cypress Automation");
		
		//select batch by dropdown
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id=\"nf-field-24\"]")));
		dropdown1.selectByContainsVisibleText("March");
		
		//select other 
		driver.findElement(By.xpath("//label[@id=\"nf-label-class-field-23-6\"]")).click();
		
		//click on register
		WebElement Register = driver.findElement(By.xpath("//input[@id=\"nf-field-15\"]"));
		Register.click();
		
		//close the browser
		driver.quit();
	}

}
