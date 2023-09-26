package SeleniumTrainings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectLooping {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver,chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		Select drpDwn = new Select(element);
		List<WebElement> allOptions = drpDwn.getOptions();
		System.out.println(allOptions.size());
		//For Each loop
		for(WebElement option:allOptions) {
			if(option.getText().equals("Option2")) {
				option.click();
				break;
			}
		}
		//For loop
		for(int i=1;i<=allOptions.size();i++) {
			if(allOptions.get(i).getText().equals("Option2")) {
				
				allOptions.get(i).click();
			}
		}
}
}
