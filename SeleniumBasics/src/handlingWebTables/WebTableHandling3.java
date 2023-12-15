package handlingWebTables;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebTableHandling3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

		//find the number of rows
		List<WebElement> rows =  driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[position()>1]"));
		
		System.out.println("Nof rows with out table header are "+rows.size());
		
		//find the number of columns
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//th"));
		System.out.println("No of columns in the table are "+ columns.size());
		
		
		List<WebElement> countryElement = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[4]"));
		//find all list of country list if if country is UK click on know more
		
		for(WebElement ele : countryElement) {
			String countryName = ele.getText();
			if(countryName.equals("UK")) {
				driver.findElement(By.xpath("//table[@id='customers']//tbody//tr//td[text()='"+countryName+"']//following-sibling::td/a")).click();
				break;
			}
		}
	Thread.sleep(2000);
	driver.quit();
	
	}
}
