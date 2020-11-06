package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils extends DriverInit{

//	public DriverUtils() {
//		System.out.println("TIS IS BLANK CONSTRUCOR");
//	}
//
//	public DriverUtils(WebDriver driver) {
//		System.out.println("TIS IS PARAM CONSTRUCOR");
//
//		this.driver = driver;
//	}

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
		return this.getDriver().getTitle();
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

		return this.getDriver().findElement(by);

	}

}
