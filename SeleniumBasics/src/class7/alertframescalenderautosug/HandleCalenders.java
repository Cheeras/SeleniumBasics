package class7.alertframescalenderautosug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalenders {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * They are nothing but webtables
		 * */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> dates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement date : dates) {
			String day = date.getAttribute("innerHTML");
			if(day.equals("9")) {
			System.out.println(date.getAttribute("innerHTML"));
			System.out.println(date.getAttribute("outerHTML"));
			break;
			}
		}
		
		
		
		
		
		
	}

}
