import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrolldown {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow=origins*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("userName")).sendKeys("ram");
		driver.findElement(By.id("userEmail")).sendKeys("asdf@1234");
		driver.findElement(By.id("currentAddress")).sendKeys("12/8 west street");
		driver.findElement(By.id("permanentAddress")).sendKeys("12/8 west street madras");
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,1000)");
        
        Thread.sleep(3000);
    	driver.findElement(By.id("submit")).click();

	}

}
