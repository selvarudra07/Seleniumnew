package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DandD2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0js86adm39wziez5xufxvcrf215106.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id='form:j_idt111_data']/li"));
		
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("window.scrollBy(0,500)");
		
		WebElement fromelement=elements.get(5);
		WebElement toelement=elements.get(1);
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(fromelement);
		actions.dragAndDrop(fromelement,toelement);
		actions.release(toelement);
		actions.build().perform();

	}

}
