package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement calender=driver.findElement(By.id("datePickerMonthYearInput"));
		calender.click();
		
		WebElement date=driver.findElement(By.xpath("//div[contains(text(),'19')]"));
		date.click();
	
		WebElement dateclick=driver.findElement(By.id("dateAndTimePickerInput"));
		dateclick.click();
		
		WebElement month=driver.findElement(By.xpath("//button[text()='Previous Month']"));
		month.click();
		
		WebElement nov=driver.findElement(By.xpath("//div[contains(text(),'10')]"));
		nov.click();
		
		WebElement time=driver.findElement(By.xpath("//li[text()='17:15']"));
		time.click();
	}

}
