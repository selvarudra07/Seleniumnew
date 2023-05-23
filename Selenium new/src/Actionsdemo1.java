import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement courses=driver.findElement(By.xpath("//a[text()='COURSES']"));
Actions obj= new Actions(driver);
obj.moveToElement(courses).perform();

WebElement datascience=driver.findElement(By.xpath("//span[text()='Data Science Training']"));
obj.moveToElement(datascience).perform();

WebElement phython=driver.findElement(By.xpath("//span[text()='Data Science with Python Training']"));
obj.click(phython).perform();
	}

}
