package class8.ExceptionInSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDownloadSearch {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://downloads/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("searchInput")).sendKeys("junit");
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#searchInput"}
		//handling shadowroot element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement searchDownloads = (WebElement)js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm > input#searchInput')");
		
		//searchDownloads.sendKeys("Junit");
		
		String js1 = "arguments[0].setAttribute('value','ShankarCheerala')";
		((JavascriptExecutor)driver).executeScript(js1,searchDownloads);
		
	}
}
