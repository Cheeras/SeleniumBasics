package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingIFrames {
	/*
	 * https://classic.freecrm.com
	 * selenium_99/selenium_99
	 * */

	public static void main(String[] args) throws Exception{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='icon icon-user_profile_new icon_rb_secondary_item']")).click();
		WebElement signIn = driver.findElement(By.xpath("//li[@data-text='Login/ Sign Up']"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(signIn)).click();
		
		WebElement loginFrame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		//driver.switchTo().frame(loginFrame);
		//using webdriver wait or explicit wait
		
		WebDriverWait waitForIframe = new WebDriverWait(driver,30);
		waitForIframe.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loginFrame));
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("7406588018");
	}
}
