package class6.windowsalertscollections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		List<WebElement> list_Images =  driver.findElements(By.tagName("img"));
		driver.findElement(By.tagName("img"));
		int countOfImages =  list_Images.size();
		System.out.println("Count of images in orange hrm website "+countOfImages);
		
		for(WebElement list : list_Images) {
		System.out.println(list.getAttribute("alt"));
		System.out.println(list.getAttribute("src"));
		System.out.println(list.getCssValue("text-align"));
		System.out.println("========================");
		}
		
	}

}
