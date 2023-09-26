package SeleniumTrainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TabSwitch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver, Chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Tab Switch
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ikea.com/");
		//window switch
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.ikea.com/");
		driver.findElement(By.xpath("//span[@class='menu-btn use-px svelte-p6b4nf']"));
		System.out.println("element clicked successfully");
	}

}
