import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("mobileNoInp")).sendKeys("6381269874");
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']")).click();	
		driver.switchTo().frame(0);
		driver.findElement(By.name("identifier")).sendKeys("ram12345");
	
	}

}
