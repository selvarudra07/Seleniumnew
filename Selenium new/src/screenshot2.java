import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot2 {

	public static void ScrnShtr(WebDriver driver) throws IOException
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp=ldt.format(dtf);

		TakesScreenshot object=(TakesScreenshot)driver;
		File src=object.getScreenshotAs(OutputType.FILE);
		File path=new File("object".concat(timestamp).concat(".png"));
		FileUtils.copyFile(src, path);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php/");

		WebElement username=driver.findElement(By.xpath("//*[@name='email']"));
		username.sendKeys("asf@1234556");
		ScrnShtr(driver);

		WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("123654987",Keys.ENTER);
		ScrnShtr(driver);

		//		WebElement login=driver.findElement(By.xpath("//*[@name='login']"));
		//		login.sendKeys(Keys.ENTER);
		//		ScrnShtr(driver);
		//		

	}

}
