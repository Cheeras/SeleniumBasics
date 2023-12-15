package class6.windowsalertscollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows2 {

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
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		List<String> handles = new ArrayList<String>(allWindows);
		for(String handle: handles) {
			if(!handle.equals(parent_Window)) {
				WebDriver childTab = driver.switchTo().window(handle);
				if(childTab.getTitle().contains("YouTube")) {
					childTab.findElement(By.xpath("//input[@id='search']")).sendKeys("@shankarCheerala");
					System.out.println("Child tab URL :"+childTab.getCurrentUrl());
				}
			}
		}
		
		
		
	}

}
