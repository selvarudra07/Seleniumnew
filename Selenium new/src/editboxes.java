import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.leafground.com/input.xhtml");

	WebElement nameBox=driver.findElement(By.id("j_idt88:name"));
	nameBox.sendKeys("Ram");

	WebElement appendBox=driver.findElement(By.id("j_idt88:j_idt91"));
	appendBox.sendKeys("city");

	WebElement getTextBox=driver.findElement(By.id("j_idt88:j_idt97"));
	String value=getTextBox.getAttribute("value");

	System.out.println(value);

	WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
	clearBox.clear();
	
	WebElement disableBox = driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div[3]/div"));
	boolean enabled= disableBox.isEnabled();
	System.out.println(enabled);
	
	}

}
