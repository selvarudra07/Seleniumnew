package pdfclass;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.manage().deleteAllCookies();
		Point p=new Point(500,5000);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.quit();
	}

}
