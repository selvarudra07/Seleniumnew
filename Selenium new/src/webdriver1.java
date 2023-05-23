import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String title=driver.getTitle();
		System.out.println(title); 
		
		String url=driver.getCurrentUrl();
		System.out.println("https://www.google.co.in/"+url);
		

	}

}
