import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.leafground.com/input.xhtml;jsessionid=node019z5d1o6dbvjgo1d327es0jmt75279.node0");

WebElement name= driver.findElement(By.id("j_idt88:name"));
name.sendKeys("ram");

//String text= name.getAttribute("ram");
//System.out.println(text);
	}

}
