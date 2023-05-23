package pdfclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandel2 {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/window.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	String oldwindow=driver.getWindowHandle();
	
	WebElement openbutton=driver.findElement(By.xpath("//span[text()='Open']"));
	openbutton.click();
	
	Set<String> handle=driver.getWindowHandles();
	for (String newwindow : handle) {
		driver.switchTo().window(newwindow);
	}
	
	WebElement dashboard=driver.findElement(By.xpath("//a[@id='right-sidebar-button']"));
	dashboard.click();
	driver.close();
	driver.switchTo().window(oldwindow);
	
	WebElement multiwindow=driver.findElement(By.xpath("//span[text()='Open Multiple']"));
	multiwindow.click();
	int noofwindows=driver.getWindowHandles().size();
	System.out.println(noofwindows);
	
	WebElement closedwindow=driver.findElement(By.xpath("//span[text()='Close Windows']"));
	closedwindow.click();
	Set<String>handles=driver.getWindowHandles();
	for (String allwindows : handles) {
		if(!allwindows.equals(oldwindow));
		driver.switchTo().window(allwindows);
		driver.close();
	}
	}
}	






