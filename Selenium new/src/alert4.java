import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://nxtgenaiacademy.com/alertandpopup/");

WebElement alertbox=driver.findElement(By.xpath("//*[@name='alertbox']"));
alertbox.click();
Thread.sleep(3000);
Alert alert=driver.switchTo().alert();
alert.accept();

WebElement confirmbox=driver.findElement(By.xpath("//*[text()='Confirm Alert Box']"));
confirmbox.click();
Thread.sleep(3000);
Alert confirmalert=driver.switchTo().alert();
confirmalert.dismiss();

WebElement promptbox=driver.findElement(By.xpath("//*[contains(text(),'Prompt')]"));
promptbox.click();
Alert prompt=driver.switchTo().alert();
prompt.sendKeys("yes");
prompt.dismiss();

	}

}
