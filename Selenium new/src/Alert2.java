import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver= new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://demoqa.com/alerts");

WebElement alertbox= driver.findElement((By.id("alertButton")));
alertbox.click();
Alert alert= driver.switchTo().alert();
alert.accept();

WebElement timealertbox= driver.findElement(By.id("timerAlertButton"));
timealertbox.click();
Thread.sleep(5000);
Alert timealert= driver.switchTo().alert();
timealert.dismiss();

WebElement confirmbox= driver.findElement(By.id("confirmButton"));
confirmbox.click();
Alert confirmalert= driver.switchTo().alert();
confirmalert.accept();

WebElement promptbox= driver.findElement(By.id("promtButton"));
promptbox.click();
Thread.sleep(5000);
Alert promptalert= driver.switchTo().alert();
promptbox.sendKeys("gopal");
Thread.sleep(5000);
promptalert.accept();

	}

}
