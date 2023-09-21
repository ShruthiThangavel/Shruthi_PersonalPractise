package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
	WebDriver driver;
	
	@Before(value="@SetCookies" ,order=1) //in before method,whichever hook ( gloabal or specific is written first that gets executed first (here setCookies))
	public void setCookies() {
		System.out.println("The cookies is set");
		
		
	}
	@Before(order=0)
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	@After(order=0)
	public void tearDown() {
		driver.quit();
	}
	@After(value="@Closed",order=1)//For after(specific or global whichever tag is written first executed last (here teardown)
	public void broswerclosure() {
		System.out.println("The Browser is closed");
	}
	public WebDriver getDriver() {
		return driver;
	}
//The order is used to prioritize the execution, if order =0 gets executed first in case of before tags and 1, 2, 3 follows
	//if order = 0 executes last followed by 1,2,3,4
	//if we want to run multiple tags, we should use 'and' , 'or' tags
	//in case of and tag all scenario getaamJas executed if all conditions are satisfied, in case of or tag anyone is satisfied also it gets executed
}
