package testngconcepts;

import org.testng.annotations.Test;

public class TC003_periorities {
    
	
	@Test(priority = 1)
	public void display()
		{
	System.out.println("Test for login page");	
	}
	@Test(priority = 3)
	public void button()
	{
		System.out.println("Test for each button");
	}
	@Test(priority=2)
	public void titlepage()
	{
		System.out.println("Test for Titlepage");
	}
}
