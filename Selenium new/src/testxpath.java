import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");

WebElement Tools= driver.findElement(By.xpath("//a[text()='Images']"));
Tools.click();
	}

}
