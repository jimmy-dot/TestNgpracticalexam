package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryButtonElement {
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//Input[@value='Add category']")
	WebElement ADD_CATEGORY_BUTTON;
	
	public void clickAddCategoryButton() {
		ADD_CATEGORY_BUTTON.click();
	
}

}
