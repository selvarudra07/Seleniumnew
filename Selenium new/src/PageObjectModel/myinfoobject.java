package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myinfoobject {
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a")
	public static WebElement myprofile;
	
	@FindBy(name="firstname")
	public static WebElement firstname;
	
	@FindBy(name="lastname")
	public static WebElement lastname;
	
	@FindBy(name="phone")
	public static WebElement phone;
	
	
	/*public static WebElement myprofle(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()=' My Profile']"));
	}
	
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.name("firstname"));
	}
	
	public static WebElement lastname(WebDriver driver) {
		return driver.findElement(By.name("lastname"));
	}

	public static WebElement phone(WebDriver driver) {
		return driver.findElement(By.name("phone"));
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()='Update Profile']"));
	}*/
}


