package testconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc01_annotation {
    @Test(priority=1)
	public void display()
	{
		System.out.println("text is displayed");
	}
	
	
	@Test(priority = 2)
	public void assertion()
	{
    	int no1=100,  no2= 50, sum;
    	String act = "Prerna" , exp ="prerna";
    	String act1 = act.toLowerCase();
    	String exp1 = exp.toLowerCase();
    	Boolean status = false;
    	
    	SoftAssert asse = new SoftAssert();
    	
    	
    	asse.assertTrue(status, "status is false");
    	sum = no1+no2;
    	System.out.println("sum is "+sum);
    	asse.assertEquals(act1,exp1,"texts are not matching");
    	
		System.out.println("Text are matching");
		asse.assertEquals(no1, no2,"values are different");
		System.out.println("values are same");
		asse.assertAll();
	}
}
