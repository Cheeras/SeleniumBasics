package class6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		String parent_Window = driver.getWindowHandle();
		System.out.println("Parent Window handle :"+parent_Window);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		for(String handles:allWindows) {
			if(!parent_Window.equals(handles)) {
				System.out.println("Linked in windhandle "+handles);
				driver.switchTo().window(handles);
				Thread.sleep(3000);
				driver.close();
			}
			System.out.println(driver.getTitle());
		}
	}

}
