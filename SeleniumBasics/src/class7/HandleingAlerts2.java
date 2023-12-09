package class7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleingAlerts2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*
		 * JavascriptExecutor jss = (JavascriptExecutor)driver;
		 * jss.executeScript("window.scrollBy(0,300)", "");
		 */
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Thread.sleep(10000);// we never know how much the alert pop up will come 
		/* Handling the dynamic alert we never know in how much it will come it can be 20 seconds,30 seconds 
		 * Then we should use WebDriverWait untill the alert present on the page
		 * 
		 * */
		//we need to write explict wait instead of Thread.sleep()
		/*
		 * Thread.sleep() is static wait and we never the alert will come in 10 seconds or 20 seconds or 30 seconds
		 * we should handle in dynamic way of handling we can use WebDriverWait which is called explicit wait
		 * 
		 * Dynamic way of handling alert is called explict wait using WebDriverWait 
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wati.until(ExpectedConditions.alertIsPresent()).getText();
		 * */
		WebDriverWait wait = new WebDriverWait(driver,30);
		String alertText = wait.until(ExpectedConditions.alertIsPresent()).getText();
		
		Alert alert = driver.switchTo().alert();//Switches to the currently active modal dialog for this particular driver instance
		System.out.println(alertText);
		alert.accept();
		
	}

}
