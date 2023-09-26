package SeleniumTrainings;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Shruthi");
		driver.findElement(By.name("inputPassword")).sendKeys("success");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//p[@class='error']")).getText();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shruthi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("shruthi98@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9677651418");
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		driver.close();
		
	}

}
