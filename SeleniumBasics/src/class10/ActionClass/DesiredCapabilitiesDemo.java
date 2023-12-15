package class10.ActionClass;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		//setting chrome preferance through HashMap
		HashMap<String,String> chromePref = new HashMap<String,String>();
		chromePref.put("profile.default_content_setting_values.notifications", "2");// 2 is for disable 1 is for enable
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/rio/login");
		driver.manage().window().maximize();
		
		
	}

}
