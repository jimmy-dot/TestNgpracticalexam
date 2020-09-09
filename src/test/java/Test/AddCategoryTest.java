package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddCategoryPage;
import Util.AddCategoryButtonElement;
import Util.BrowserFactory;

public class AddCategoryTest {
	WebDriver driver;

	@Test
	public void UserAbleToAddCategory() {

		driver = BrowserFactory.launchBrowser();

		AddCategoryPage addcategory = PageFactory.initElements(driver, AddCategoryPage.class);
		AddCategoryButtonElement addbutton = PageFactory.initElements(driver, AddCategoryButtonElement.class);

		addcategory.NewCategory("Mercedes E350");
		addbutton.clickAddCategoryButton();
		

	}

}
