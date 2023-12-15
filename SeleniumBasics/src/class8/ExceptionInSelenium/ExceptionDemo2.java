package class8.ExceptionInSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ExceptionDemo2 {

	public static void main(String[] args) throws Exception {

		readFile();
	}
	
	public static void readFile() throws Exception {
		FileInputStream fis = new FileInputStream(new File(""));
		Properties pro = new Properties();
		pro.load(fis);
	}
}
