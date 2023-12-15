package class7.alertframescalenderautosug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker3 {

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
		
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("datepicker")));
		driver.findElement(By.id("datepicker")).click();
		
		new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ui-datepicker-div")));
		selectDate("29","May","2024",driver);
	}
	
	public static String[] getMonthYear(String monthYearval) {
		return monthYearval.split(" ");
	}
	
	public static void selectDate(String exday,String exmonth,String exYear,WebDriver driver) {
		

		String monthYearval =  driver.findElement(By.className("ui-datepicker-title")).getText();
		/*
		 * hit next button untill month==March and Year=2024 
		 * if it is March 2024 then select date 21th March 2024
		 * */
		while(!(getMonthYear(monthYearval)[0].equals(exmonth) && getMonthYear(monthYearval)[1].equals(exYear))) {
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 monthYearval =  driver.findElement(By.className("ui-datepicker-title")).getText();
			 System.out.println(monthYearval);
		}
		driver.findElement(By.xpath("//a[text()='"+exday+"']")).click();
	}
}
