package SeleniumTrainings;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {
	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		String link =driver.getCurrentUrl();
		System.out.println(link);
		String ps =driver.getPageSource();
		System.out.println(ps);
		String window_id=driver.getWindowHandle();
		System.out.println("The current window is :"+ window_id);
		Boolean display=driver.findElement(By.id("openwindow")).isDisplayed();
		if(display) {
			driver.findElement(By.id("openwindow")).click();
		}
//		Set<String> all_openWindows= driver.getWindowHandles();
//		System.out.println("All windows that are actve: "+ all_openWindows);
		Boolean enable=driver.findElement(By.id("autocomplete")).isEnabled();
		System.out.println(enable);
		driver.findElement(By.xpath("//input[@name='radioButton']")).click();
		Boolean select =driver.findElement(By.xpath("//input[@name='radioButton']")).isSelected();
		System.out.println(select);
		Set<String> all_openWindows= driver.getWindowHandles();
		System.out.println("All windows that are actve: "+ all_openWindows);
		
	}

}
