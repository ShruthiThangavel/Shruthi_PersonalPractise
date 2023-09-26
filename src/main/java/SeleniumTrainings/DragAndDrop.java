package SeleniumTrainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver, Chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.xpath("//div[text()='Washington'][2]"));
		WebElement destination=driver.findElement(By.xpath("//div[text()='United States']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
	}

}
