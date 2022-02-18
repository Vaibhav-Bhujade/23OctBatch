package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	
	@Test (priority = 0, groups = {"Sanity","Feb" })
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test (priority = 0, dependsOnMethods = "test1", groups = "Sanity")
	public void test2()
	{
		
		System.out.println("Test2");
	}
	
	@Test (priority = 2, groups = "Regression")
	public void test3()
	{
		
		System.out.println("Test3");
	}
	
	@Test (priority = 4, groups = "Feb")
	public void test4()
	{
		System.out.println("Test4");
	}
	
	@Test (priority = 5, groups = "Regression")
	public void test5()
	{
		Assert.assertTrue(false);
		System.out.println("Test5");
	}
}
