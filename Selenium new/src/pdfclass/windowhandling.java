package pdfclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
	 String	window1=driver.getWindowHandle();
	 
	 Set<String> handles=driver.getWindowHandles();
	 for (String window2 : handles) {
		 driver.switchTo().window(window2);
		}
	 driver.findElement(By.xpath("//a[@id='right-sidebar-button']")).click();
	 driver.switchTo().window(window1);
	 
	 driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	 int noofwindows= driver.getWindowHandles().size();
	 System.out.println(noofwindows);
	 
	 driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
	 Set<String> closewindows=driver.getWindowHandles();
	 for (String allwindows : closewindows) {
		if(!allwindows.equals(closewindows));
		driver.switchTo().window(allwindows);
		driver.close();
	}
	}
	}


