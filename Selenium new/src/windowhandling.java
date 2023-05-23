import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
import net.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate.ForStringConstructor;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		WebElement newbutton=driver.findElement(By.xpath("//span[text()='Open']"));
		newbutton.click();
		
		String oldwindow=driver.getWindowHandle();
		
		
		Set<String> handles=driver.getWindowHandles();
		
		{
			
		for (String newwindow : handles) 
			driver.switchTo().window(newwindow);
		}
		
		WebElement dashboard=driver.findElement(By.xpath("//a[@id='right-sidebar-button']"));
		dashboard.click();
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(oldwindow);
		
		WebElement multiwindow=driver.findElement(By.xpath("//span[text()='Open Multiple']"));
		multiwindow.click();
		
		int noofwindows=driver.getWindowHandles().size();
		System.out.println(noofwindows);
		
		WebElement closewindow=driver.findElement(By.xpath("//span[text()='Close Windows']"));
		closewindow.click();
		
		Set<String> newwindowhandel=driver.getWindowHandles();
		for (String allwindows : newwindowhandel) {
			if(!allwindows.equals(oldwindow));
			driver.switchTo().window(allwindows);
			driver.close();
			
		}
		
				
	}

}
