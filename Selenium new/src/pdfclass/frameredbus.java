package pdfclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameredbus {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		
		WebElement frame= driver.findElement(By.className("modalIframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("0123456789");
		
		WebElement frame2=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		frame2.click();
		
		String window=driver.getWindowHandle();
		
		WebElement oldwindow=driver.findElement(By.xpath("//div[text()='Email or phone']"));
		oldwindow.sendKeys("abc@123456");
		
		Set<String> handle=driver.getWindowHandles();
		for (String newwindow : handle) {
		driver.switchTo().window(newwindow);
		}
		
	
	}

}
