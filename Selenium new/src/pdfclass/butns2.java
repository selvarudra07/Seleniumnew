package pdfclass;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class butns2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement getpositions=driver.findElement(By.xpath("//button[@id='position']"));
		org.openqa.selenium.Point xypoint=getpositions.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X value is:"+xvalue+"Y value is:"+yvalue);

		WebElement getcolor=driver.findElement(By.xpath("//button[@id='color']"));
		String color=getcolor.getCssValue("background-color");
		System.out.println("Backgroundcolor is :"+color);

		WebElement buttonsize=driver.findElement(By.xpath("//button[@id='size']"));
		int height=buttonsize.getSize().getHeight();
		int width=buttonsize.getSize().getWidth();
		System.out.println("Height is :"+height+"Widht is :"+width);

		WebElement clickbutton=driver.findElement(By.xpath("//button[@id='home']"));
		clickbutton.click();

	}

}
