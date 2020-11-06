package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pageobjects.CommonPageObject;

public class NewTest {
//	DriverInit di = new DriverInit();
//	WebDriver driver = di.getDriver();
//	GooglePageObject googlePO = new GooglePageObject(driver);
//	GoogleSignInPageObject googleSignInPO = new GoogleSignInPageObject(driver);
//	
	@Before()
	public void beforeMethod() {

		System.out.println("THIS IS BEFORE METOD RUNNING");
		CommonPageObject.getCommonPO().di.getDriver();

	}

	@After()
	public void afterMethod() {
		System.out.println("THIS IS AFTERE METOD RUNNING");
		CommonPageObject.getCommonPO().di.quitDriver();

	}

	@Test
	public void urlTest() {
		System.out.println("RUNNING URL TEST");
	//	CommonPageObject.getCommonPO().googlePO.navigateToHomepage();
		String currentUrl = CommonPageObject.getCommonPO().driver.getCurrentUrl();
		System.out.println("CURRENT URL IS " + currentUrl);
		Assert.assertEquals("https://www.google.com/", currentUrl);
	}

	@Test
	public void titleTest() {
		System.out.println("RUNNING TITLE TEST");
	//	CommonPageObject.getCommonPO().googlePO.navigateToHomepage();
		String currenTitle = CommonPageObject.getCommonPO().driver.getTitle();
		System.out.println("CURRENT TITLE IS " + currenTitle);
		Assert.assertEquals("Google", currenTitle);
	}

	@Test
	public void enterValueToSearchBoxTest() {
		// googlePO.enterValueInSearchBox("HELLOW WORLDs");
		//CommonPageObject.getCommonPO().googlePO.navigateToHomepage();
		CommonPageObject.getCommonPO().googlePO.clickSignInButton();
		CommonPageObject.getCommonPO().googleSignInPO.enterEmailText("samaythakakrnew@gmail.com");

	}

}
