package pdfclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("window.scrollBy, (0,1000)");
		driver.findElement(By.linkText("No Content")).click();

	}

}
