package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageStatus {
	
	@BeforeTest
	public void beforeStatusModule()
	{
		System.out.println("Gallary should be accesible");
	}
	
	@AfterTest
	public void afterStatusModule()
	{
		System.out.println("After Status module");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("pre condition for image status");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("pre condition for image status");
	}
	
@BeforeMethod
	
	public void preConditionForTestCase()
	{
		System.out.println("Keypad should be enabled");
	}

	@AfterMethod
	public void postConditionForTestCase()
	{
		System.out.println("Keypad should be disabled");
	}
	
	@Test
	public void test1() {
		System.out.println("Image Status test case 1");
	}
		@Test
		public void test2() {
			System.out.println("Image Status test case 2");
		}
			@Test
			public void test3() {
				System.out.println("Image Status test case 3");
	}

}
