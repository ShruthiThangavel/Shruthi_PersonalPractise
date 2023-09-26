package SeleniumTrainings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver",
				"C:\\BrowserDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Boolean chkBox=driver.findElement(By.id("checkBoxOption1")).isSelected();
		if(!(chkBox)) {
			driver.findElement(By.id("checkBoxOption1")).click();
			
		}
		List<WebElement> options1 =driver.findElements(By.xpath("//input[@type='checkbox' ]"));
		System.out.println("The sixe of checkbox is: " + options1.size());
	}

}
