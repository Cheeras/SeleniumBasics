package class8;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/rio/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Shankar\\Desktop\\SeleniumJars\\monster.png");
		try {
			FileHandler.copy(screenshot, destination);
		} catch (IOException e) {
			System.out.println("Screen shot capturing is failed");
		}
		
	}
	

}
