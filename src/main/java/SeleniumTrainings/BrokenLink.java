package SeleniumTrainings;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		//System.setProperty("Webdriver.Chrome.driver",
				//"C:\\BrowserDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new EdgeDriver(options);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement echLink : links) {
			String url = echLink.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("Href is empty");
				continue;
			}
		}
		String reqURL = driver.findElement(By.cssSelector("a[href*=restapitutorial]")).getAttribute("href");
		HttpURLConnection connection = (HttpURLConnection) new URL(reqURL).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		System.out.println(connection.getResponseCode());
	}
}
