package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void MethodTest() {
		System.out.println("I am inside test");
	}
	@BeforeClass
	public void MethodBeforeClass() {
		System.out.println("I am inside beforeclass");
	}
	@BeforeMethod
	public void MethodBeforeMethod() {
		System.out.println("I am inside beforeMethod");
	}
	@AfterClass
	public void MethodAfterClass() {
		System.out.println("I am inside afterclass");
	}
	@AfterMethod
	public void MethodAfterMethod() {
		System.out.println("I am inside aftermethod");
	}
	@Test
	public void Test1() {
		System.out.println("I am inside test1");
	}
	@BeforeTest
	public void MethodBeforeTest() {
		System.out.println("I am inside before test");
	}
	@AfterTest
	public void MethodAfterTest() {
		System.out.println("I am inside after test");
	}
	@BeforeSuite
	public void MethodBeforeSuite() {
		System.out.println("I am inside before suite");
	}
	@AfterSuite
	public void MethodAfterSuite() {
		System.out.println("I am inside after suite");
	}
	
	//Refer the output for priority
	

}
