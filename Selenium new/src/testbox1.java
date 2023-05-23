import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://demoqa.com/text-box");

WebElement name= driver.findElement(By.xpath("//input[@id='userName']"));
name.sendKeys("ram");

WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
email.sendKeys("test@gmail.com");

WebElement currentaddress= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
currentaddress.sendKeys("41/asdf12345");

WebElement permanentaddress= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
permanentaddress.sendKeys("12/asxcf789654");
Thread.sleep(3000);

WebElement submit= driver.findElement(By.xpath("//button[text()='Submit']"));
submit.click();
	}

}
