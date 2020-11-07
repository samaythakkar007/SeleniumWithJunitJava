package tests;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pageobjects.CommonPageObject;
import rules.ScreenshotRule;
import utilities.DriverInit;

public class NewTest {

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


	@Test
	public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
		int leftLimit = 65; // letter 'a'
		int rightLimit = 90; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();

		System.out.println(generatedString);
		;
	}

}