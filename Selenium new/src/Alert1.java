import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0jmsc5yp3e61zk0a10hfyts2361446.node0");

		WebElement alertbox= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		alertbox.click();	
		Alert alert= driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

		WebElement confirmbox= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		confirmbox.click();
		Alert confirmAlert= driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();

		WebElement promptbox= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		promptbox.click();
		Alert promptalert=driver.switchTo().alert();
		promptalert.sendKeys("ram");
		Thread.sleep(3000);
		promptalert.accept();

	}

}
