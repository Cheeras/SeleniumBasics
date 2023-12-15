package class7.alertframescalenderautosug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/rio/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
		System.out.println("Total no of links in page "+links.size());
		
		for(WebElement link : links) {
			System.out.println("Name of the link "+link.getAttribute("innerHTML"));
			System.out.println("Href of the link "+link.getAttribute("href"));
			System.out.println("=================");
		}
		
		
	}

}
