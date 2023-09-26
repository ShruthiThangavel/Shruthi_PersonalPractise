package SeleniumTrainings;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class JavaScriptExecutor {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('name').value='Shruthi'");
		js.executeScript("document.getElementById('name').style.border='10px red solid';");
		js.executeScript("document.getElementById('name').style.background='yellow';");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\hi\\Pictures\\Screenshots\\JavascriptExecutor.png");
		FileUtils.copyFile(source, target);
		WebElement box = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		js.executeScript("arguments[0].scrollIntoView();",box);
		js.executeScript("document.getElementById('displayed-text').style.border='10px red dotted';");
		js.executeScript("arguments[0].setAttribute('value','Shruthi')",box);
		js.executeScript("document.getElementById('show-textbox').click()");
		System.out.println("Element CLicked");
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File("C:\\Users\\hi\\Pictures\\Screenshots\\ScrollIntoView.png");
		FileUtils.copyFile(source1, target1);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
