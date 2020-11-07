package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils {
	

	private static DriverUtils driverUtilsInstance = null;
	
	
	public static DriverUtils getDriverUtilInstance() {
		
		if(driverUtilsInstance == null) {
			driverUtilsInstance = new DriverUtils();
		}
		
		return driverUtilsInstance;
	}
	
	
	
	public void clickElement(String elementString) {
		WebElement element = this.getElement(elementString);

		element.click();
	}

	public String getElementString(String elementString) {
		WebElement element = this.getElement(elementString);
		return element.getText();
	}

	public void sendText(String elementString, String textToSend) {
		this.getElement(elementString).sendKeys(textToSend);
	}

	public String getTitle() {
		return DriverInit.getInstance().getDriver().getTitle();
	}

	public WebElement getElement(String elementString) {
		By by = null;
		String elementBy = elementString.split("-->")[0];
		String elementLocater = elementString.split("-->")[1];

		if (elementBy.equalsIgnoreCase("xpath")) {
			by = By.xpath(elementLocater);
		} else if (elementBy.equalsIgnoreCase("id")) {
			by = By.id(elementLocater);
		}

		return DriverInit.getInstance().getDriver().findElement(by);

	}

	public void openUrl(String url) {
		DriverInit.getInstance().getDriver().navigate().to(url);
	}
	
	public String getCurrentURL() {
		return DriverInit.getInstance().getDriver().getCurrentUrl();
	}
}
