

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		Dimension d =new Dimension(250,250);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p= new Point(500,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		String pagesource=driver.getPageSource();
		System.out.println("pagesource"+pagesource);
		
		driver.get("https://www.google.co.in/");
		driver.get("https://www.instagram.com/accounts/login/");
		Set<String> obj=driver.getWindowHandles();
		System.out.println("window"+obj);
	
		driver.manage().deleteAllCookies();

	}

}
