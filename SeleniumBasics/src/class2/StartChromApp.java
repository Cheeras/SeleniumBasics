package class2;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartChromApp {
	public static void main(String args[]) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		driver.quit();
	}
}
