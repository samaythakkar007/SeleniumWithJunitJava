package tests;

import java.io.File;
import java.io.FileOutputStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pageobjects.CommonPageObject;
import rules.ScreenshotRule;
import utilities.DriverInit;

public class NewTest{

	
	@Rule
    public ScreenshotRule screenshotTestRule = new ScreenshotRule();
	 
	
	@Test
	public void urlTest() {
		System.out.println("RUNNING URL TEST");
		CommonPageObject.getCommonPO().getGooglePageObject().navigateToHomepage();
		String currentUrl = CommonPageObject.getCommonPO().getGooglePageObject().getCurrentUrl();
		System.out.println("CURRENT URL IS " + currentUrl);
		Assert.assertEquals("https://www.google.com/", currentUrl);
	}

	@Test
	public void titleTest() {
		System.out.println("RUNNING TITLE TEST");
		CommonPageObject.getCommonPO().getGooglePageObject().navigateToHomepage();
		String currenTitle = CommonPageObject.getCommonPO().getGooglePageObject().getTitle();
		System.out.println("CURRENT TITLE IS " + currenTitle);
		Assert.assertEquals("Google", currenTitle);
	}

	@Test
	public void enterValueToSearchBoxTest() {
		CommonPageObject.getCommonPO().getGooglePageObject().navigateToHomepage();
		CommonPageObject.getCommonPO().getGooglePageObject().clickSignInButton();
		CommonPageObject.getCommonPO().getGoogleSignInPO().enterEmailText("samaythakakrnew@gmail.com");

	}


}