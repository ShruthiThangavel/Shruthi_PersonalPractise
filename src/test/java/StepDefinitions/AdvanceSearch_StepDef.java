package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AdvanceSearch_StepDef {
	WebDriver driver;
	public AdvanceSearch_StepDef(CommonSteps cs) {
		this.driver=cs.getDriver();
	}
	
	@Given("The user in advance search page")
	public void userinAdvancesearch() {
		System.out.println("User is in Advance search page");
		//System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver-win32\\chromedriver.exe");
				
				driver.get("https://www.ebay.com/sch/ebayadvsearch");
				System.out.println("User in advance search page page");
				driver.manage().window().maximize();
		
	}
	@When("The user clicks home button")
	public void userclicksHome() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		System.out.println("User clicks on home button");
	}
	@Then("The user navigates from advance search to home page")
	public void userBackToHome() {
		String expected = "https://www.ebay.com/";
		String actual = driver.getCurrentUrl();
		if(!actual.equals(expected))
			System.out.println("Page not navigated");
		else
		System.out.println("User is navigated back to home page");
	}
	@When("The user enters the value and performs advance search")
	public void advanceSearchByValues(DataTable dataTable) {
		driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
//		WebElement element = driver.findElement(By.xpath("//select[@id='s0-1-17-4[0]-7[3]-_sacat']"));
//		Select select =new Select(element);
//		select.deselectByValue(dataTable.cell(1, 1));
		driver.findElement(By.xpath("//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox']")).sendKeys(dataTable.cell(1, 1));
		driver.findElement(By.xpath("//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox']")).sendKeys(dataTable.cell(1, 2));
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}

}
