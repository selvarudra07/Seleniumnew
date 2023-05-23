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

public class screenshot {
	
public static void ScrnShtr(WebDriver driver) throws IOException
{
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
	LocalDateTime ldt=LocalDateTime.now();
	String timestamp=ldt.format(dtf);

	TakesScreenshot facebook=(TakesScreenshot)driver;
	File src=facebook.getScreenshotAs(OutputType.FILE);
	File dest=new File("facebook".concat(timestamp).concat(".png"));
	FileUtils.copyFile(src, dest);
}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement facebook= driver.findElement(By.xpath("//input[@type='text']"));
	facebook.sendKeys("asdf@12345");
	
	ScrnShtr (driver);
	}

}
