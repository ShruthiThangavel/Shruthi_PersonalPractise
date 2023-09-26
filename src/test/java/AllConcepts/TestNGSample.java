package AllConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSample {
	@Test(priority=2,description="This is a login test")
	public void Test1() {
		System.out.println("Test1 successful");
	}
	@Test(priority=1,description="This is a logoff test")
	public void Test2() {
		System.out.println("Test2 successful");
	}
	@BeforeTest
	public void login() {
		System.out.println("Logged in");
	}
	@AfterTest
	public void logoff() {
		System.out.println("Logged out");
		
	}
	@AfterMethod
	public void statement() {
		System.out.println("method completed");
	}

}
