package waits;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesProxySetting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		DesiredCapabilities des = new DesiredCapabilities();
		//to accept/handle  untrusted sites by using desired capabilities 
		des.setAcceptInsecureCerts(true);
		// we can not pass the directly desiredcapabilites to chromedriver from selenium 3.6 but
		// before selenium 3.6 we can set desiredcapabilites object to ChromeDriver  from selenium 3.6 we need 
		// Use ChromeOptions class in between
		
		Proxy p = new Proxy();
		p.setHttpProxy("localhost:8080");
		des.setCapability(CapabilityType.PROXY, p);
		
		ChromeOptions options = new ChromeOptions();
		
		options.merge(des);
		
	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/");
		
	}

}
