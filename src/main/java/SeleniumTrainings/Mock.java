package SeleniumTrainings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Mock {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver, Chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.get("https://www.ikea.com/");
		WebElement element = driver
				.findElement(By.xpath("//select[@id='business-loyalty-signup-form-industrySegment']"));
		Select select = new Select(element);
		List<WebElement> dropdown = select.getOptions();
		for (int i = 0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText() == "Education") {
				dropdown.get(i).click();
				break;
			}
		}

	}
}
