package class8.ExceptionInSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	/*
	 * What is Utility - 
	 * lets take scenarion i want to take screenshot 10 times
	 * Takes screenshot 4 lines of code i need write all 10 places which is redundent code
	 * in order to remove redundent code we will write small utility/library/reusable method for taking screenshot
	 * 
	 * Utility or libraries are 2 tyeps
	 * project independent library
	 * 	example takescreenshot
	 * Project dependent Library 
	 * 
	 * */
	public static void takeScreenShot(WebDriver driver) {
		
		TakesScreenshot tsObj = (TakesScreenshot)driver;// this is downcasting driver object is capable of dealing with all differnt broswer operation 
		//but after downcasting the driver ref to TakeScreehshot - it can only take screenshot nothing else
		File src = tsObj.getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\Screenshots\\sample_"+System.currentTimeMillis()+".png";
		File destination = new File(destinationFilePath);
		try {
			FileHandler.copy(src, destination);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.err.println("Screenshot capturing is failed");
		}
	}
	
	//current date and time genetator
	
	public static String getCurrentDateAndTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MMM-dd_HH_mm_ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    return formattedDate;
	}

}
