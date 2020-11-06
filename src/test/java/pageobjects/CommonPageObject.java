package pageobjects;

import org.openqa.selenium.WebDriver;

import utilities.DriverInit;


public class CommonPageObject {

	private static CommonPageObject single_instance = null;
	
	public DriverInit di = new DriverInit();
	public WebDriver driver = di.getDriver();
	public GooglePageObject googlePO = new GooglePageObject(getDriverFromCommonObject());
	public GoogleSignInPageObject googleSignInPO = new GoogleSignInPageObject(getDriverFromCommonObject());
	
	
	private CommonPageObject() {
		
	}
	
	public static CommonPageObject getCommonPO() {
		
		if(single_instance == null) {
			single_instance = new CommonPageObject();
		}
		
		return single_instance;
	}
	
	private WebDriver getDriverFromCommonObject() {
		if(this.driver == null) {
			this.driver = di.getDriver();
			return this.driver;
		}else {
			return this.driver;
		}
	}
	
}
