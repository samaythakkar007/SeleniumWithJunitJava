package pageobjects;

import org.openqa.selenium.WebDriver;

import utilities.DriverInit;


public class CommonPageObject {

	private static CommonPageObject single_instance = null;

	private static  GooglePageObject googlePO = null ;
	private static  GoogleSignInPageObject googleSignInPO = null; ;
	
	
	private CommonPageObject() {
		
	}
	
	public GooglePageObject getGooglePageObject() {
		
		if(googlePO == null) {
			googlePO = new GooglePageObject();
		}
		return googlePO;
		
	}
	
	public GoogleSignInPageObject getGoogleSignInPO() {
		
		if(googleSignInPO == null) {
			googleSignInPO = new GoogleSignInPageObject();
		}
		return googleSignInPO;
		
	}
	
	
	public static CommonPageObject getCommonPO() {
		
		if(single_instance == null) {
			single_instance = new CommonPageObject();
		}
		
		return single_instance;
	}
	

	
}
