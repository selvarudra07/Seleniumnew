import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("www.google.com");
	}

}
