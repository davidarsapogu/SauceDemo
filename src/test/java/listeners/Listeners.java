package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Test Started: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success: " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed: " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped: " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("On Test Method: " + context.getOutputDirectory());
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish Method: " + context.getOutputDirectory());
	}
}
