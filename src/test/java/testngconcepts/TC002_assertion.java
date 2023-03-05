package testngconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC002_assertion {
	
	
    @Test
	public void intvaluematch()
	{
		SoftAssert sa = new SoftAssert();
		
		String actual="selenium" , expected = "java";
		String newexp = expected.toLowerCase();
		
		boolean act=true, exp = false;
		sa.assertEquals(actual, newexp,"Not matching");
		System.out.println("matching");
		Assert.assertTrue(act, "status is false");
		System.out.println("status is true");
		sa.assertAll();
	}
    
    @Test
    public void intvaluematching() {
		int a=140,b=500;
		Assert.assertEquals(140, 500,"values not matching");
		System.out.println("values matching");
	}
}
