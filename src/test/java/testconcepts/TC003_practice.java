package testconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_practice {
    
	@Test
	public void compare()
	{
		String act = "prerna",exp = "Prerna";
		String exp1 = exp.toLowerCase();
		Assert.assertEquals(act, exp1,"text are not matching");
		System.out.println("Text are matching");
	}
	@Test
	public void message()
	{
		System.out.println("My name is Prerna");
	}
	}
	

