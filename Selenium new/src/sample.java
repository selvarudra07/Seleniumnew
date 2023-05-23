import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		}
	
	}


