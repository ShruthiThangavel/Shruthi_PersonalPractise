package SeleniumTrainings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TopicsSoFar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver, Chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//label[@for='radio1']")).click();
		Thread.sleep(3000);
		System.out.println("radio button clickeds");
		WebElement element=driver.findElement(By.id("dropdown-class-example"));
		Select DrpDown = new Select(element);
		List<WebElement> allOptions = DrpDown.getOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
		DrpDown.selectByValue("option2");
		List<WebElement> choice=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(choice.size());
		driver.findElement(By.id("checkBoxOption1"));
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Alert alert =  driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("all methoda so far has been implemented");
		}

}
