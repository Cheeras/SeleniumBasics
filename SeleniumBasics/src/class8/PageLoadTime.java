package class8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);//always it should be before driver.get();
		//it will be applicable for all driver.get() methods in after driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS)
		driver.get("https://www.foundit.in/rio/login");
		driver.manage().window().maximize();
		
		}

}
