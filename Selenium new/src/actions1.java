import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("http://www.greenstechnologys.com/");

WebElement course=driver.findElement(By.xpath("//*[text()='COURSES']"));
Actions obj=new Actions(driver);
obj.moveToElement(course).perform();

WebElement robotic=driver.findElement(By.xpath("//*[text()='Robotic Process Automation Training']"));
obj.moveToElement(robotic).perform();

WebElement uipath=driver.findElement(By.xpath("//*[text()='UiPath Training']"));
obj.click(uipath).perform();
	}

}
