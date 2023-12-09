package assignement1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UrlValidationIE {

	public static void main(String[] args) {
	// URL validation before login and after login to Orange HRM
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Shankar\\Desktop\\SeleniumJars\\IEDriverServer.exe");

		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String beforeLoginURL = driver.getCurrentUrl();
		
		if(beforeLoginURL.contains("login")) {
			System.out.println("Login page loaded");
		}else {
			System.out.println("Login page is not loaded");
		}
		
		WebElement username = driver.findElementByName("username");
		if(username.isDisplayed()) {
		username.sendKeys("Admin");
		}
		WebElement password =  driver.findElementByName("password");
		
		password.sendKeys("admin123");
		
		WebElement loginButton =  driver.findElementByXPath("//button[normalize-space()='Login']");
		String buttonText = loginButton.getText().trim();
		if(buttonText.equalsIgnoreCase("Login")) {
			System.out.println("Login text of the button verified");
			System.out.println(buttonText);
		}else {
			System.out.println("Login in text not verified > Test failed");
		}
		loginButton.click();
		String afterLoginURL = driver.getCurrentUrl();
		if(afterLoginURL.contains("dashboard")) {
			System.out.println("Login to Orange HRM is successful.");
		}else {
			System.err.println("Login in failed. Test failed");
		}
		
		//driver.close();
	}

}
