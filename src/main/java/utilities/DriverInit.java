package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {

	private static DriverInit instance = null;
	private WebDriver driver;

	private DriverInit() {

	}

	public WebDriver getDriver() {

		if(driver == null) {
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
		return driver;

		}else {
		return driver;
		}
	}

	public static DriverInit getInstance() {
		if (instance == null) {
			instance = new DriverInit();
		}
		return instance;
	}
	
	public void quitDriver() {
		this.driver.quit();
		this.driver = null;
	}

//	private static void driverIntialzie() {
//
//		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		options.addArguments("enable-automation");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-infobars");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--disable-browser-side-navigation");
//		options.addArguments("--disable-gpu");
//		driver = new ChromeDriver(options);
//		driver.get("https://www.google.com");
//
//	}
//
//	public static WebDriver getDriver() {
//		if (.driver == null) {
//			System.out.println("CINITATIATING DRIVVER IN METHOD");
//			driverIntialzie();
//			return this.driver;
//		} else {
//			return this.driver;
//		}
//
//	}
//
//	public void quitDriver() {
//		if (driver != null) {
//			System.out.println("CLOSING DRIVERRRRRRR");
//			this.driver.close();
//			this.driver = null;
//			System.out.println("DRIVER NULLIFEID");
//		}

}
