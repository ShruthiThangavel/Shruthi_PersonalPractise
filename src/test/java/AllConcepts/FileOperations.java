package AllConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileOperations {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream("C:\\Automation_workspace\\AutomationTrainings\\src\\test\\resources\\Properties");
		prop.load(input);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		FileOutputStream output = new FileOutputStream("C:\\Automation_workspace\\AutomationTrainings\\src\\test\\resources\\Properties");
		System.setProperty("Message", "Happy new year 2023");
		prop.store(output, "Test Data");
		
	}

}
