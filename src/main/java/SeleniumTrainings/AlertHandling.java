package SeleniumTrainings;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert=driver.switchTo().alert();
		String actualtext =alert.getText();
		String expectedText="Hello , share this practice page and share your knowledge";
		if(actualtext.equals(expectedText)) {
			System.out.println("Text validated");
			System.out.println(actualtext);
		}
		else
			System.out.println("actual and expected does mot match");
		alert.accept();
		System.out.println("Alert is handled");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		System.out.println("Alert dismissed");
		driver.quit();
		
	}

}
