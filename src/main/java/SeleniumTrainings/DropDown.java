package SeleniumTrainings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		Select drpDwn = new Select(element);
		drpDwn.selectByIndex(1);
		Thread.sleep(5);
		drpDwn.selectByValue("option2");
		Thread.sleep(5);
		drpDwn.selectByVisibleText("Option3");
		Thread.sleep(5);
		System.out.println("Execution completed");
		driver.close();
		
		
	}
	

}
