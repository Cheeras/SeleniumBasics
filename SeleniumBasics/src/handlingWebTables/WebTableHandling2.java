package handlingWebTables;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebTableHandling2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//find the maximum current price column
		
		
		
		//count of rows // use position()>1 if at all headers are not include
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		System.out.println("Total number rows is "+rows.size());
		//count of columns 
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']//thead//th"));
		System.out.println("Total number of colomns are "+cols.size());
		String max="";
		double m=0,r=0;
		for(int i=0;i<rows.size();i++) {
			
			max = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+(i+1)+"]//td[4]")).getText();
			m = Double.parseDouble(max);
			if(m>r) {
				r = m;
			}
		}
		System.out.println("Maximum current price is "+r);
		driver.quit();
	}
}
