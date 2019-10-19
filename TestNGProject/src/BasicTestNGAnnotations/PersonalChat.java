package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalChat {

	@BeforeClass
	public void beforeClass() {
		System.out.println("pre condition for personal chat");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("post condition for personal chat");
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
		System.out.println("Personal chat test case 1");
	}
		@Test
		public void test2() {
			System.out.println("Personal chat test case 2");
		}
			@Test
			public void test3() {
				System.out.println("Personal chat test case 3");
	}
}
