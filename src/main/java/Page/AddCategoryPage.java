package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage {

	@FindBy(how = How.XPATH, using = "//Input[@name='categorydata']")
	WebElement ADD_CATEGORY;

	public void NewCategory(String category) {

		ADD_CATEGORY.sendKeys(category);
	}

}
