package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DandD {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0dnwvonbk265c1j2n9zrbfap5y468000.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drop=driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions action=new Actions(driver);
		
		//action.clickAndHold(drag).moveToElement(drop).build().perform();
		action.dragAndDrop(drag, drop).build().perform();

	}

}
