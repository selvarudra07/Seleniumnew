import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.33.0-win32\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.get("http://www.google.co.in");

driver.close();	
	}

}


