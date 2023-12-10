package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		DesiredCapabilities des = new DesiredCapabilities();
		//to accept/handle  untrusted sites by using desired capabilities 
		des.setAcceptInsecureCerts(true);
		// we can not pass the directly desiredcapabilites to chromedriver from selenium 3.6 but
		// before selenium 3.6 we can set desiredcapabilites object to ChromeDriver  from selenium 3.6 we need 
		// Use ChromeOptions class in between
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobars");
		
		options.merge(des);
		
	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/");
		
	}

}
