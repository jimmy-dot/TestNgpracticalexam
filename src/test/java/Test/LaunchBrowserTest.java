package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Util.BrowserFactory;

public class LaunchBrowserTest {

	WebDriver driver;
	
	@Test
	public void OpenBrowser() {
		driver = BrowserFactory.launchBrowser();

		// BrowserFactory.tearDown();
}
	
}
