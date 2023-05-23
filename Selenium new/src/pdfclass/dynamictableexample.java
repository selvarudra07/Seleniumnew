package pdfclass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictableexample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/grid.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> column=driver.findElements(By.tagName("th"));
		int columncount=column.size();
		System.out.println("No of columns" + columncount);
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		int rowcount=row.size();
		System.out.println("No of rows" + rowcount);
		
		WebElement getprice=driver.findElement(By.xpath(".//*[text()='Blue Band']//following::td[2]"));
		String priceamount=getprice.getText();
		System.out.println("price is" + priceamount);
		
		List<WebElement> allpricelist=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> pricelist=new ArrayList<Integer>();
		
		for (WebElement webElement : allpricelist) {
			String individualprice=webElement.getText().replace("$"," ");
			pricelist.add(Integer.parseInt(individualprice));
		}
	
		System.out.println("finallist" + pricelist);
	} 
	

}
