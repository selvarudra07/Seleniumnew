import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node019z5d1o6dbvjgo1d327es0jmt75279.node0");

		WebElement from= driver.findElement(By.id("form:drag_content"));
		WebElement to= driver.findElement(By.id("form:drop_header"));

		Actions actions= new Actions(driver);
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform();	//the build perform is for complete all this tasks
		actions.dragAndDrop(from, to).build().perform();
	}

}
