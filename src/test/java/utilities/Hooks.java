//package utilities;
//
//import org.junit.Before;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.TakesScreenshot;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import utilities.ConfigUtils;
//
//
//public class Hooks {
//
//	public static WebDriver driver;
//	private static boolean initialized = false;
//	private ConfigUtils config = new ConfigUtils();
//
//	@Before
//	public void beforeScenario() throws Exception {
//		try {
//			String browserType = config.getBrowserType();
//
//			if (browserType.equalsIgnoreCase("chrome")) {
//				System.out.println("Chrome is selected");
//				WebDriverManager.chromedriver().version(config.getBrowserVersion()).setup();
//				driver = new ChromeDriver();
//				initialized = true;
//			} else if (browserType.equalsIgnoreCase("firefox")) {
//				System.out.println("Firefox is selected");
//				WebDriverManager.firefoxdriver().version(config.getBrowserVersion()).setup();
//				driver = new FirefoxDriver();
//				initialized = true;
//			}else {
//				throw new Exception("Please select a valid browser type in config file");
//			}
//		} catch (Exception e) {
//			throw new Exception("Exception occurred while running before scenario -->" + e);
//		}
//
//	}
//
//	public WebDriver getDriver() {
//		return driver;
//	}
//
//	@After
//	public void afterScenario(Scenario scenario) {
//		System.out.println("This will run after the Scenario");
//		if (scenario.isFailed()) {
//			// Take a screenshot...
//			final byte[] screenshot = ((TakesScreenshot) this.getDriver()).getScreenshotAs(OutputType.BYTES);
//			scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
//		}
//	}
//}
