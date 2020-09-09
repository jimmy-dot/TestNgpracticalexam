package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DuplicateCategoryPage;
import Util.AddCategoryButtonElement;
import Util.BrowserFactory;

public class DuplicateCategoryTest {
	
WebDriver driver;
	
		
	
	@Test
	public void UserShouldBeAbleToAddCategory() {
		
		driver = BrowserFactory.launchBrowser();
		
		
		DuplicateCategoryPage add_Duplicate_category= PageFactory.initElements(driver, DuplicateCategoryPage.class);
		AddCategoryButtonElement addcategorybutton = PageFactory.initElements(driver, AddCategoryButtonElement.class);
		
		add_Duplicate_category.new_Duplicate_category("Mercedes E350");
		addcategorybutton.clickAddCategoryButton();

}
}
