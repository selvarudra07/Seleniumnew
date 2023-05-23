package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement alert1=driver.findElement(By.id("alertButton"));
		alert1.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(7000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.dismiss();
		
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert4=driver.switchTo().alert();
		alert4.sendKeys("Ram");
		alert4.accept();
	}

}
