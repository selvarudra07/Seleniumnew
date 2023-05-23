package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/alert.xhtml#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		Thread.sleep(3000);
		WebElement modaldialog=driver.findElement(By.id("j_idt88:j_idt101_title"));
		Alert alert=driver.switchTo().alert();
		
		
		
		
		

	}

}
