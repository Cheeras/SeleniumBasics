package class6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialIconsList {
	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> social_Icons =  driver.findElements(By.xpath("//a[contains(@href,'linkedin') or contains(@href,'facebook') or contains(@href,'twitter') or contains(@href,'youtube')]"));
		
		int count = social_Icons.size();
		System.out.println("Count of social icons "+count);
		
		for(WebElement ele: social_Icons) {
			System.out.println(ele.getAttribute("hostname"));
			System.out.println(ele.getAttribute("href"));
			System.out.println(ele.getAttribute("host"));
		}
				
	}

}
