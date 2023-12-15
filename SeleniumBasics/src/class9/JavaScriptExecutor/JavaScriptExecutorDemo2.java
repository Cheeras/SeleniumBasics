package class9.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) {

		/*
		 * In order to execute JavaScript in selenium java code we will use JavaScriptExecutor Interface
		 * 
		 * To execute javascript in our webdriver script we do not have to write separate code we have predefied interface 
		 * is avialble which is JavaScriptExecutor
		 * JavaScriptExecutor is interface available in org.openqa.selenium.JavascriptExecutor
		 * 
		 * InSide this interface we have some predefined method is called executeScript() - what ever the 
		 * java script we will pass it as string it will be executed JavaScript Executor
		 * */
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");// to start broswer in maximize mode
		options.addArguments("--disable-infobars");//
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		WebElement ele =     driver.findElement(By.xpath("(//p[contains(text(),'Excepteur sint occaecat cupidatat')])[6]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		System.out.println(ele.getAttribute("innerHTML"));
		/*
		 * where to use javascript executor 
		 * 1.Scroll up and down and scroll into view
		 * 2.highlighting the webelement
		 * 3.changing text ,color,backgroud color 
		 * */
		
		
		
	}
}
