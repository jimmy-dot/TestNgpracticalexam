package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DuplicateCategoryPage;
import Page.ValidateDuplicateMessagePage;
import Util.AddCategoryButtonElement;
import Util.BrowserFactory;

public class ValidateDuplicateMessageTest {

	WebDriver driver;
	@Test
	public void ValidateDuplicateMessage() {
		driver = BrowserFactory.launchBrowser();
		
		 DuplicateCategoryPage enterduplicate = PageFactory.initElements(driver, DuplicateCategoryPage.class );
		 AddCategoryButtonElement clickaddcategorybutton = PageFactory.initElements(driver,
					AddCategoryButtonElement.class);
		 ValidateDuplicateMessagePage validatemessage = PageFactory.initElements(driver, ValidateDuplicateMessagePage.class);
		 
		 enterduplicate.new_Duplicate_category("Mercedes E350");
		 clickaddcategorybutton.clickAddCategoryButton();
		 validatemessage.ValidateDuplicateMessage();
		 
		 
		 
	}
}
