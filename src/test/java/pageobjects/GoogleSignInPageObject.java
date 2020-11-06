package pageobjects;

import org.openqa.selenium.WebDriver;

import utilities.DriverUtils;


public class GoogleSignInPageObject extends DriverUtils{
	
	public GoogleSignInPageObject(WebDriver driver) {
		super.driver = driver;
	}
	
//
//	public GoogleSignInPageObject() {
//		super.driver = driver;
//	}
//	
	
	String inputEmailTextBox = "xpath-->//input[@type='email']";
	
	public void enterEmailText(String email) {
		this.sendText(inputEmailTextBox, email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	
//	public WebDriver getDriverSession() {
//		return super.driver;
//	}

}
