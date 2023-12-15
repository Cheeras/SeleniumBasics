package class8.ExceptionInSelenium;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {

	public static void main(String[] args) {

		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MMM-dd_HH_mm_ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
		
	}

}
