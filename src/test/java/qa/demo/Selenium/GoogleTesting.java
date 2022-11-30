package qa.demo.Selenium;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleTesting {
	
	@Test
	public void test1() {
		
		Reporter.log("Testcase 1 execution start", true);
		
		int num = 2;
		
		Reporter.log("Testcase 1 input " + num);
		
		Assert.assertTrue(num == 2);
	}
	
	@Test
	public void test2() {
		
		Reporter.log("Testcase 2 execution start", true);
		
		int num = 2;
		
		Assert.assertTrue(num == 6);
	}
	
	
	@Test
	public void test3() {
		
		Reporter.log("Testcase 3 execution start", true);
		
		int num = 2;
		
		Assert.assertTrue(num != 6);
	}
	
	

}