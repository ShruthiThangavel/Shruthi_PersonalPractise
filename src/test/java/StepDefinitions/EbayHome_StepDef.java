package StepDefinitions;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_StepDef {
	WebDriver driver ;
	public EbayHome_StepDef(CommonSteps cs) {
		this.driver=cs.getDriver();
	}
	@Given("User on Ebay home page")
	public void homePage() {
		//System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver-win32\\chromedriver.exe");
		
		driver.get("https://www.ebay.com/");
		System.out.println("User in Ebay.com home page");
		driver.manage().window().maximize();
	}
	@When("User clicks on Advanced search link")
	public void clickAdvancedLink() {
		driver.findElement(By.linkText("Advanced")).click();
		System.out.println("User clicks the Advance search url");
	}
	@Then("User navigates to advance search page")
	public void navigateToAdvancesearch() {
		String expected = "https://www.ebay.com/sch/ebayadvsearch";
		String actual = driver.getCurrentUrl();
		if(!expected.equals(actual)) {
			fail("Page not navigated");
		}
		else
		System.out.println("Page navigated");
		
			
	}
	@When("I search for iphone11")
	public void textSearch() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
	}
	@Then("the number of search results are validated")
	public void validateSearchResults() {
		String results = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span[1]")).getText().trim();
		String result1=results.replace(",","");
		int result=Integer.parseInt(result1);
		if(result<=2000) {
			fail("search results less than 2000");
		}
		else 
			System.out.println("Search results are greater than 2000");
		
	
	
	}
	@Then("the number of  results more than {int} is validated")
	public void validatesearch(int num) {
		String results = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span[1]")).getText().trim();
		String result1=results.replace(",","");
		int result=Integer.parseInt(result1);
		if(result<=num) {
			fail("search results less than 1000");
		}
		else 
			System.out.println("Search results are greater than"+num);
		
	
	
	}
	@When("The {string} is entered in textBox and searched")
	public void enterValue(String string) {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
	}
	@When("The {string} is entered in textBox and category {string} is searched")
	public void enterValues(String string1,String string2) {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(string1);
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='gh-cat']"));
		for(WebElement ch:options) {
			if(ch.getText().trim().toLowerCase()==string2.trim().toLowerCase()) {
				ch.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
	}
	@When("User clicks the {string}")
	public void clickOnLink(String link) throws Exception {
		driver.findElement(By.linkText(link)).click();
		Thread.sleep(3000);
		
	}
	@Then("User navigates to page with {string} and {string}")
	public void validateTitle(String curUrl,String title) {
		String actualurl=driver.getCurrentUrl();
		String actualtitle=driver.getTitle();
		if(!actualurl.equals(curUrl)) {
			fail("Url doesnt match");
		}
		if(!actualtitle.contains(title)) {
			fail("title doesnt match");
		}
		else
			System.out.println("Case passed");
		
	}
		
	
	

}
