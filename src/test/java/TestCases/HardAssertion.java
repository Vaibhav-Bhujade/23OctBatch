package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
		
		@Test 
		public void test1()
		{
			System.out.println("Test1");
			Assert.assertEquals("Java", "Java","fail hotay ka");	//Pass
			System.out.println("This is test case 1");
		}
		
		@Test 
		public void test2()
		{
			System.out.println("Test2");
			Assert.assertEquals(400, 200, "Fail zala na");			//Fail
			System.out.println("This is test case 2");
		}
		
		@Test 
		public void test3()
		{
			
			System.out.println("Test3");
			Assert.assertTrue(true);				//Pass
		}
		
		@Test 
		public void test4()
		{
			System.out.println("Test4");
			Assert.assertTrue(false);				//failed
		}
		
		@Test 
		public void test5()
		{
			System.out.println("Test5");
			Assert.assertFalse(false);
		}
		
		@Test 
		public void test6()
		{
			System.out.println("Test5");
			Assert.assertFalse(true,"test6");
		}	
}

