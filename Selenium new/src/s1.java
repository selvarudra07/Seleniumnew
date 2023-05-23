import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	WebDriver driver;
	
	public WebDriver setupDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
		public void launch(String url)
		{
			driver.get("https://www.facebook.com/");
		}
		
		public void close()
		{
			driver.close();
		}
		//driver.get("https://www.facebook.com/");
		
//		WebElement email=driver.findElement(By.id("email"));
//		email.sendKeys("test@gmail.com");
//		
//		WebElement pass=driver.findElement(By.id("pass"));
//		pass.sendKeys("12345");
//		
//		WebElement login=driver.findElement(By.name("login"));
//		login.click();
		
		
	}


