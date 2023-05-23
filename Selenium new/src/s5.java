import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s5 {
	public static void ScrnShtr(WebDriver driver) throws IOException
	{
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-SS");
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp= ldt.format(dtf);

		TakesScreenshot twitter= (TakesScreenshot)driver;
		File src= twitter.getScreenshotAs(OutputType.FILE);
		File path= new File("twitter".concat(timestamp).concat(".png"));
		FileUtils.copyFile(src, path);
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://twitter.com/i/flow/login");

		WebElement email= driver.findElement(By.name("text"));
		email.sendKeys("test@123");

		WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();

		ScrnShtr (driver);





	}

}
