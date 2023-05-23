import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");

		WebElement dropdown=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select obj=new Select(dropdown);
		Thread.sleep(3000);
		obj.selectByIndex(7);
		Thread.sleep(3000);
		obj.selectByValue("8");
		Thread.sleep(3000);
		obj.selectByVisibleText("Yellow");

		dropdown.sendKeys("red");

		WebElement multiselect=driver.findElement(By.xpath("//select[@id='cars']"));
		Select multiselectbox=new Select(multiselect);

		multiselectbox.selectByIndex(0);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);

		List<WebElement>listofoptions =multiselectbox.getOptions();
		int size=	listofoptions.size();
		System.out.println("no of elements: "+ size);


	}

}
