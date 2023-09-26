package AllConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	@Test
	public void TitleTest() {
		System.setProperty("webdriver,chrome.driver", "C:\\BrowserDrivers\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String expectedTitle = "Practice-Page";
		String actualTitle = driver.getTitle();
		sa.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title match");
		driver.close();
		sa.assertAll();
	}

}
