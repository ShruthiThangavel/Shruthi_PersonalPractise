package SeleniumTrainings;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Scrrenshot_SpecificElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.Chrome.driver",
				"C:\\BrowserDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		WebElement spcific_img = driver.findElement(By.xpath("//div[4]"));
		File source=spcific_img.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\hi\\Pictures\\Screenshots\\Specific_img.png");
		FileUtils.copyFile(source, target);
	}
}
