package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement course=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions action=new Actions(driver);
		action.moveToElement(course).perform();
		
		WebElement oracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		action.moveToElement(oracle).perform();
		
		WebElement training=driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		action.moveToElement(training).perform();
		training.click();
	}

}
