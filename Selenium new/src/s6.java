import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://accounts.google.com");

WebElement email=driver.findElement(By.id("identifierId"));
email.sendKeys("test@gmail.com");

WebElement login=driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span"));
login.click();


	}

}
