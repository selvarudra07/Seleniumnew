import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01iuzwq01d0r5x15ge3glje716d32733.node0");

		WebElement getPositionButton=driver.findElement(By.className("ui-button-text ui-c"));
		Point xypoint=getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is :"+xValue+"Y value is :"+ yValue);

		WebElement colorButton= driver.findElement(By.className("ui-button-text ui-c"));
		String color=colorButton.getCssValue("background-color");
		System.out.println("Button color is :"+color);

		WebElement sizeButton=driver.findElement(By.className("ui-button-text ui-c"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("Height is :"+height+ "Width is :"+width);

		WebElement confirmButton = driver.findElement(By.className("ui-button-text ui-c"));
		confirmButton.click();
	}

}
