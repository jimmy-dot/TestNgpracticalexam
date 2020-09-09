package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DuplicateCategoryPage;
import Page.ValidateDuplicateCategoryPage;
import Util.AddCategoryButtonElement;
import Util.BrowserFactory;

public class ValidateDuplicateCategoryTest {
	WebDriver driver;

	@Test
	public void ValidateDuplicateCategoryMessage() {

		driver = BrowserFactory.launchBrowser();

		DuplicateCategoryPage EnterDuplicate = PageFactory.initElements(driver, DuplicateCategoryPage.class);
		ValidateDuplicateCategoryPage ValidateMessage = PageFactory.initElements(driver,
				ValidateDuplicateCategoryPage.class);
		AddCategoryButtonElement clickaddcategorybutton = PageFactory.initElements(driver,
				AddCategoryButtonElement.class);

		EnterDuplicate.new_Duplicate_category("Mercedes E350");
		clickaddcategorybutton.clickAddCategoryButton();
		ValidateMessage.ValidateDuplicateMessagePage();
	}

}
