import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementtwit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("gopal");
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("annamalai");
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("anna7789" +Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gopal3654789");
		driver.findElement(By.xpath("//input[@name='birthYear']")).sendKeys("1980");

	}

}
