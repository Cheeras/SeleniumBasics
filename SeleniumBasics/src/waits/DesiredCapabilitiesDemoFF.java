package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DesiredCapabilitiesDemoFF {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");// to start broswer in maximize mode
		//options.addArguments("--incongnito");
		//options.addArguments("--disable-extensions");// to disable flash notifications
		//options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobars");// it is deprecated not working
		//options.addArguments("--disable-notifications");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.selenium.dev/");
		//driver.quit();
		
	}

}
