package class7.alertframescalenderautosug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * They are nothing but webtables, write a test case select 7th Jan 2024 date
		 * */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();
		
		//span[text()='Next']
		//span[@class='ui-datepicker-month']//following-sibling::span
		
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getAttribute("innerHTML");
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']//following-sibling::span")).getAttribute("innerHTML");
	}
}
