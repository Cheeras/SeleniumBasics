package handlingWebTables;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebTableHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//no of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		System.out.println("No of rows in table "+rows.size());
		
		//no of columns
		List<WebElement> colms =  driver.findElements(By.xpath("//table[@class='dataTable']//thead//th"));
		System.out.println("No of colms in table "+colms.size());
		
		
		//5 row data 
	    WebElement row5 =  driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[5]"));
	    System.out.println("Row5 data is "+ row5.getText());
	    WebElement row5Col5Data = row5.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[5]//td[5]"));
	    System.out.println("Row5Col5Data "+row5Col5Data.getText());
		
		//3 row 4th column value
		WebElement row3And4thColumn =driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[3]//td[4]"));
		System.out.println(row3And4thColumn.getText());
		
		driver.quit();
	}
}
