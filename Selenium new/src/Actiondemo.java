import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement course= driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		
		WebElement oracle= driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(oracle).perform();
		
		WebElement sql= driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		a.click(sql).perform();

	}

}
