package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test (enabled=false)
	public void method1()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Exection of method1 started");
		s.assertEquals(100, 100,"check fail hotay ka");
		System.out.println("Soft assert works");
		s.assertTrue("java".equals("Java"),"its failing");
		System.out.println("Exection of method1 finished");
	}
	
	@Test
	public void method2()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Exection of method2 started");
		s.assertEquals("Harry", "Harry","check fail hotay ka");
		System.out.println("Soft assert works");
		s.assertTrue(false,"its failing");
		System.out.println("Exection of method2 finished");
		s.assertAll();
	}
	
	
	
}
