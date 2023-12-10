package waits;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitiesDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--start-maximized");// to start broswer in maximize mode
		options.addArguments("--incongnito");
		//options.addArguments("--disable-extensions");// to disable flash notifications
		//options.addArguments("--disable-popup-blocking");
		//options.addArguments("--disable-infobars");// it is deprecated not working
		//options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/");
		//driver.quit();
		
	}

}
