package pageobjects;

import org.openqa.selenium.WebDriver;

import utilities.DriverUtils;


public class GooglePageObject extends DriverUtils{
	
	String searchBox = "xpath-->//input[@name='q']";
	String searchBtn = "xpath-->(//input[@name='btnK'])[2]";
	String signInBtn = "xpath-->//a[text()='Sign in']";
	
	public GooglePageObject(WebDriver driver) {
		System.out.println("THIS IS GOOGLE PAGEOBJECT CUNSTROCUTRO");
		super.driver = driver;
	}
	
	public GooglePageObject() {

	}
	
	public void enterValueInSearchBox(String valueToEnter) {
		this.sendText(searchBox, valueToEnter);
	}
			
	public void clickSearchButton() {
		this.clickElement(searchBtn);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickSignInButton() {
		this.clickElement(signInBtn);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void navigateToHomepage() {
		this.getDriver().get("https://www.google.com/");
	}
	
	
	

	
	
}
