package testconcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample implements ITestListener{

	public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
		System.out.println(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
        System.out.println(context.getName()+ "*******");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+"*******");
	}

}
