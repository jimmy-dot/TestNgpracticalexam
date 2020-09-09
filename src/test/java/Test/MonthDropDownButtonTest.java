package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.MonthDropDownPage;
import Util.BrowserFactory;

public class MonthDropDownButtonTest {
	WebDriver driver;
	
	@Test
	public MonthDropDownButtonTest(WebDriver driver) {

		this.driver = driver;

		driver = BrowserFactory.launchBrowser();
		
		MonthDropDownPage monthdropdown = PageFactory.initElements(driver, MonthDropDownPage.class);
		
		monthdropdown.ClickMonthDropDown();
	}


		
}
