package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAssignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String beforeLoginURL =  driver.getCurrentUrl();
		
		if(beforeLoginURL.contains("login")) {
			System.out.println("Login page is loaded successfully");
		} else {
			System.out.println("Login page is not loaded successfully");
		}
		
		WebElement username = driver.findElementByName("username");
		if(username.isDisplayed()) {
		username.sendKeys("Admin");
		}
		WebElement password =  driver.findElementByName("password");
		if(password.isDisplayed()) {
			password.sendKeys("admin123");
		}
		driver.findElementByXPath("//button[normalize-space()='Login']").click();
		
		String afterLoginURL = driver.getCurrentUrl();
		
		if(afterLoginURL.contains("dashboard")) {
			System.out.println("Orange HRM Login successful");
		}else {
			System.out.println("Orange HRM Login failed");
		}
		
		driver.findElement(By.xpath("//a/span[text()='Admin']")).click();
		
	}
}
