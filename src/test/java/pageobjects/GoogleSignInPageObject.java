package pageobjects;

import org.openqa.selenium.WebDriver;

import utilities.DriverUtils;


public class GoogleSignInPageObject{

	String inputEmailTextBox = "xpath-->//input[@type='email']";
	
	public void enterEmailText(String email) {
		DriverUtils.getDriverUtilInstance().sendText(inputEmailTextBox, email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
