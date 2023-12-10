package class9.ActionsClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class JavaScriptExecutorDemo {

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
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Hello shankar Cheerala')");
		//js.executeScript("prompt('Hello shankar Cheerala')");// to enter some text in prompt popup
		
		/*
		 * where to use javascript executor 
		 * 1.Scroll up and down
		 * 2.highlighting the webelement
		 * 3.changing text ,color,backgroud color 
		 * */
		
		
		
	}
}
