package SeleniumTrainings;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.Chrome.driver",
				"C:\\BrowserDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sorurce=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\hi\\Pictures\\Screenshots\\FullPage.png");
		FileUtils.copyFile(sorurce, target);
	}
}
