import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {

	public static void ScrnShtr(WebDriver driver) throws IOException
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-SS");
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp=ldt.format(dtf);

		TakesScreenshot twitter=(TakesScreenshot)driver;
		File src=twitter.getScreenshotAs(OutputType.FILE);
		File path=new File("twitter".concat(timestamp).concat(".png"));
		FileUtils.copyFile(src, path);

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		ScrnShtr (driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("test123456");
		Thread.sleep(3000);

		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		Thread.sleep(3000);
		ScrnShtr (driver);

		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345678");
		Thread.sleep(3000);

		ScrnShtr (driver);
		WebElement login=driver.findElement(By.xpath("//span[text()='Log in']"));
		login.click();
		Thread.sleep(3000);

		ScrnShtr (driver);
	}

}
