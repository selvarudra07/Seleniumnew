import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		WebElement promptbox= driver.findElement(By.id("promtButton"));
		promptbox.click();
		Thread.sleep(5000);
		Alert promptalert= driver.switchTo().alert();
		promptbox.sendKeys("gopal");
		Thread.sleep(5000);
		promptalert.accept();

	}

}
