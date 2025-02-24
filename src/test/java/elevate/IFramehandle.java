package elevate;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
	

		driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.id("actionButton"));
		frame.click();
		String text = frame.getText();
		System.out.println(text);
		driver.quit();
	}

}
