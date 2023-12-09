package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.urlContains("registration"));//registration
		
		wait.until(ExpectedConditions.titleContains("Registration"));
		wait.until(ExpectedConditions.titleIs("Registration | foundit India"));
		
		

	}

}
