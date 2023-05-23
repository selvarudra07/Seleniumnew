package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class dd1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select obj=new Select(dropdown1);
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,5000)");
		obj.selectByIndex(2);
		Thread.sleep(3000);	
		obj.selectByValue("5");
		obj.selectByVisibleText("Yellow");
		Thread.sleep(3000);
		dropdown1.sendKeys("Violet");
		
		WebElement multibox=driver.findElement(By.xpath("//select[@id='cars']"));
		Select obj1=new Select(multibox);
		obj1.selectByIndex(1);
		obj1.selectByValue("opel");
		obj1.selectByVisibleText("Audi");
		
		List<WebElement> listofoptions=	obj1.getOptions();
		int size=listofoptions.size();
		System.out.println("no of options :"+size);
	}

}
