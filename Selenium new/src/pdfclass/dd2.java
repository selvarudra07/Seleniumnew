package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dd2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Ram");

		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("gopal");

		WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("1234567890");
		
		WebElement newpass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpass.sendKeys("789456123");
		
		WebElement date=driver.findElement(By.id("day"));
		Select obj=new Select(date);
		obj.selectByIndex(9);
		
		WebElement month=driver.findElement(By.id("month"));
		Select obj1=new Select(month);
		obj1.selectByValue("1");
		
		WebElement year=driver.findElement(By.id("year"));
		Select obj2=new Select(year);
		obj2.selectByVisibleText("2020");
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Sign Up']"));
		button.click();
		
		List<WebElement>listofnos=obj2.getOptions();
		int	size=listofnos.size();
		System.out.println("list of nos :"+size);
		

	}

}
