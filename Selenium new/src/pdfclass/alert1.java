package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

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

		WebElement timealert=driver.findElement(By.id("timerAlertButton"));
		timealert.click();
		Thread.sleep(7000);
		Alert talert=driver.switchTo().alert();
		talert.accept();

		WebElement confirm=driver.findElement(By.id("confirmButton"));
		confirm.click();
		Alert confirmalert=driver.switchTo().alert();
		confirmalert.dismiss();

		WebElement prompt=driver.findElement(By.id("promtButton"));
		prompt.click();
		Alert promptalert=driver.switchTo().alert();
		promptalert.sendKeys("gopal");
		promptalert.accept();
	}

}
