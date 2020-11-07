package pageobjects;

import org.openqa.selenium.WebDriver;

import utilities.DriverUtils;


public class GooglePageObject {
	
	String searchBox = "xpath-->//input[@name='q']";
	String searchBtn = "xpath-->(//input[@name='btnK'])[2]";
	String signInBtn = "xpath-->//a[text()='Sign in']";
	
	
	public void enterValueInSearchBox(String valueToEnter) throws Exception {
		try { 
		DriverUtils.getDriverUtilInstance().sendText(searchBox, valueToEnter);
		}catch(Exception e) {
			throw new Exception("Exception occurred while entering value in search box --->"+e);
		}
	}
			
	public void clickSearchButton() {
		DriverUtils.getDriverUtilInstance().clickElement(searchBtn);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSignInButton() {
		DriverUtils.getDriverUtilInstance().clickElement(signInBtn);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void navigateToHomepage() {
		DriverUtils.getDriverUtilInstance().openUrl("https://www.google.com/");
	}
	
	public String getCurrentUrl() {
		return DriverUtils.getDriverUtilInstance().getCurrentURL();
	}
	
	public String getTitle() {
		return DriverUtils.getDriverUtilInstance().getTitle();
	}
	
	
	

	
	
}
