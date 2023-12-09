package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/rio/login");
		/*  Specifies the amount of time the driver should wait when searching for an element if it is 
		 *  not immediately present. When searching for a single element, the driver should poll the 
		 *  page until the element hasbeen found, or this timeout expires before throwing a NoSuchElementException.
		 *  Whensearching for multiple elements, the driver should poll the page until at least one element has 
		 *  been found or this timeout has expired. 
		 *  Increasing the implicit wait timeout should be used judiciously as it will have an 
		 *  adverse effect on test run time, especially when used with slower location strategies like XPath.
		 *  Parameters:time The amount of time to wait.
		 *  unit The unit of measure for time.Returns:*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/* important points for implicit wait
		 * 1.if you give implicit wait default wait time it 250 milliseconds
		 * 2.by default selenium will not add any wait time default is zero meaning if you don't give
		 * 3.Implicit wait is universal wait for all elements of that particular session of the driver
		 * 4.it will wait for element presence
		 * 5.if the webelement is not found with in specified time it will through NoSuchElementException
		 * */
		driver.findElement(By.id("signInName")).sendKeys("Testing");
		driver.quit();

	}
}
