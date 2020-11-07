package rules;

import java.io.File;
import java.io.FileOutputStream;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.DriverInit;

public class ScreenshotRule implements MethodRule {
	   public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, final Object o) {
	        return new Statement() {
	            @Override
	            public void evaluate() throws Throwable {
	                try {
	                    System.out.println("THIS IS BEFORE METOD RUNNING FROM RULE");
	                	DriverInit.getInstance().getDriver();
	                    statement.evaluate();
	                } catch (Throwable t) {
	                    captureScreenshot(frameworkMethod.getName());
	                    throw t; // rethrow to allow the failure to be reported to JUnit
	                }finally{
	                    DriverInit.getInstance().quitDriver();
	                }
	            }
	            
	            
	            
	            public void captureScreenshot(String fileName) {
	                try {
	                	System.out.println("TAKING SCREENSHOT");
	                    new File("target/surefire-reports/").mkdirs(); // Insure directory is there
	                    FileOutputStream out = new FileOutputStream("target/surefire-reports/screenshot-" + fileName + ".png");
	                    out.write(((TakesScreenshot) DriverInit.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES));
	                    out.close();
	                } catch (Exception e) {
	                    // No need to crash the tests if the screenshot fails
	                }
	            }
	        };
	    }
}
