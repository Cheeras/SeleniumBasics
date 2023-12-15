package class4.oopslocatorways;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) {

		//Selenium version used 3.141
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Desktop\\SeleniumJars\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/select-menu");
		
		
		WebElement colorDropDown =  driver.findElementById("oldSelectMenu");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", colorDropDown);


		Select select = new Select(colorDropDown);// Constructor. A check is made that the given element is, 
		//indeed, a SELECT tag.
		//If it is not,then an UnexpectedTagNameException is thrown 
		
		//check wheather drop down is multidrop down or not
		System.out.println(select.isMultiple());
		select.selectByValue("3"); // Option tag value attribute 
		System.out.println(select.getFirstSelectedOption().getText());
		//case sensitive- recommded one
		select.selectByVisibleText("White");//Visible text on UI
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByIndex(1);// drop down index starts from 0 to n
		System.out.println(select.getFirstSelectedOption().getText());
		
		List<WebElement> colors =  select.getOptions();
		for(WebElement ele : colors) {
			System.out.println(ele.getText());
		}
		
		driver.close();
		
		
	}

}
