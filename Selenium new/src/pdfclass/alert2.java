package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement alert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert.click();

		Alert simplealert=driver.switchTo().alert();
		simplealert.accept();

		WebElement alert2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alert2.click();
		Thread.sleep(8000);
		Alert latealert=driver.switchTo().alert();
		latealert.accept();

		WebElement confirm=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirm.click();
		Alert confirmalert=driver.switchTo().alert();
		confirmalert.dismiss();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1000)");

		WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		Alert promptalert=driver.switchTo().alert();
		promptalert.sendKeys("ram");
		promptalert.accept();


	}

}
