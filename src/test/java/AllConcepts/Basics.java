package AllConcepts;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basics {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chrome.driver", "C:\\BrowserDrivers\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// Validate radio buttons
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='radioButton'])[3]")).click();
		Thread.sleep(2000);
		System.out.println("Radio buttons clicked");
		// Validate checkboxes
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("checkBoxOption2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("checkBoxOption3")).click();
		Thread.sleep(2000);
		// Static Dropdowns
		Select selectValue = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		selectValue.selectByVisibleText("Option2");
		selectValue.selectByValue("option1");
		Thread.sleep(2000);
		// selectValue.deselectByValue("option1");
		selectValue.selectByValue("option3");
		Thread.sleep(2000);
		File picture = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date current_date = new Date();
		// System.out.println(current_date);
		String fileName = current_date.toString().replace(" ", "-").replace(":", "-");
		FileUtils.copyFile(picture, new File("C:\\Automation_workspace\\AutomationTrainings\\src\\main\\resources\\Screenshots\\" + fileName + ".png"));
		Thread.sleep(2000);
		// Switch to alert
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shruthi");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		// Switchtoframe
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.switchTo().frame("iframe-name");
		System.out.println("Switched to frame");
		driver.findElement(By.xpath("//a[text()='More ']"));
		Thread.sleep(1000);
		File pictureAfterFrameSwitch = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pictureAfterFrameSwitch, new File("C:\\Automation_workspace\\AutomationTrainings\\src\\main\\resources\\Screenshots\\" + "after_frameSwitch" + ".png"));
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement mouseHover=driver.findElement(By.id("mousehover"));
		action.moveToElement(mouseHover);
		action.build().perform();
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		Thread.sleep(1000);
		File pictureFinally = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pictureFinally, new File("C:\\Automation_workspace\\AutomationTrainings\\src\\main\\resources\\Screenshots\\" + "beforeWindowSwitch" + ".png"));
		//Window Handle
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		Thread.sleep(6000);
		Set<String> WindowsAvailable = driver.getWindowHandles();
		System.out.println(WindowsAvailable);
		Iterator<String> iterator = WindowsAvailable.iterator();
		String parentWindow=iterator.next();
		String childWindow=iterator.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(5000);
		File picture1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(picture1,new File("C:\\Automation_workspace\\AutomationTrainings\\src\\main\\resources\\Screenshots\\" + "afterWindowSwitch" + ".png" ));
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		System.out.println("Switched back");
		driver.quit();
	}

}
