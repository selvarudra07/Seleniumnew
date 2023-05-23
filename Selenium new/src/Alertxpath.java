import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://nxtgenaiacademy.com/alertandpopup/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement alertbox= driver.findElement(By.xpath("//button[text()='Alert Box']"));
alertbox.click();
Alert alert= driver.switchTo().alert();
alert.accept();

WebElement confirmbox= driver.findElement(By.xpath(" //button[contains(text(),'Confirm')]"));
confirmbox.click();
Alert confirm= driver.switchTo().alert();
confirm.dismiss();

WebElement promptbox= driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
promptbox.click();
Alert prompt= driver.switchTo().alert();
prompt.sendKeys("yes");
prompt.accept();

	}

}
