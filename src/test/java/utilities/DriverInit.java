package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {

	public static WebDriver driver;
	
	public DriverInit() {
		
	}


	public void driverIntialzie() {

		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation");
		options.addArguments("--disable-gpu");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		
	}
	
	

	public WebDriver getDriver() {
		if (this.driver == null) {
			System.out.println("CINITATIATING DRIVVER IN METHOD");
			driverIntialzie();
			return this.driver;
		} else {
			return this.driver;
		}

	}
	
	public void quitDriver() {
	    if (driver != null) {
			System.out.println("CLOSING DRIVERRRRRRR");
			this.driver.close();
			this.driver = null;
			System.out.println("DRIVER NULLIFEID");        }

	}

}
