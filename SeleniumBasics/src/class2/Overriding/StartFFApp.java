package class2.Overriding;

import org.openqa.selenium.firefox.FirefoxDriver;

public class StartFFApp {
	public static void main(String args[]) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shankar\\Desktop\\SeleniumJars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
