import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	//driver.get("https://www.leafground.com/dashboard.xhtml");
	driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01d6hfod38bc5sfujlqejrrkkx39046.node0");
	//driver.findElement(By.linkText("How many links in this page?")).click();
	driver.findElement(By.partialLinkText("without clicking me")).click();
	}

}
