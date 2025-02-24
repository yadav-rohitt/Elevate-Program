package elevate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Open the Drag & Drop demo site
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        // Locate source (draggable) and target (droppable) elements
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));

        // Perform Drag & Drop action
        Actions action = new Actions(driver);
        action.dragAndDrop(source, target).perform();

        System.out.println("Drag & Drop Action Performed!");

        // Close browser
        //driver.quit();
    }

}
