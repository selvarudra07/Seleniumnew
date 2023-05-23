import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownfb {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("selva");
		driver.findElement(By.name("lastname")).sendKeys("shamee");
		Thread.sleep(3000);
		WebElement mailid=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mailid.sendKeys("selvayoyobit@gmail.com");
		
		WebElement reenter=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reenter.sendKeys("selvayoyobit@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9600436338");
		WebElement bday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select obj=new Select(bday);
		obj.selectByIndex(6);
		WebElement bmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select obj1=new Select(bmonth);
		obj1.selectByValue("7");
		
		WebElement byear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select obj2=new Select(byear);
		obj2.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		

	}

}
