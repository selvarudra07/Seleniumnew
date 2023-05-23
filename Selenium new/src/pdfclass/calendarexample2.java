package pdfclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarexample2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		
		WebElement date=driver.findElement(By.id("datePickerMonthYearInput"));
		date.click();
		
		WebElement dateclick=driver.findElement(By.xpath("//div[text()='14']"));
		dateclick.click();
		
		WebElement datetime=driver.findElement(By.id("dateAndTimePickerInput"));
		datetime.click();
		
		driver.findElement(By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']")).click();
		Thread.sleep(3000);
		
		WebElement year=driver.findElement(By.xpath("//div[text()='2024']"));
		year.click();
		
		WebElement time=driver.findElement(By.xpath("//li[text()='10:45']"));
		time.click();
		
		driver.findElement(By.xpath("//span[@class='react-datepicker__month-read-view--down-arrow']")).click();
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.xpath("//span[text()='March']"));
		month.sendKeys("March");
	}

}
