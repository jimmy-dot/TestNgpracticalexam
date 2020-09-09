package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ValidateDuplicateCategoryPage {

WebDriver driver;
	
	public  ValidateDuplicateCategoryPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// Element Library

	  @FindBy(how = How.XPATH, using ="//a[text()='Nevermind']") WebElement
	  NEVERMIND_OPTION;
		
		// Methods to interact with the elements

		public void ValidateDuplicateMessagePage() {
	  Assert.assertEquals( NEVERMIND_OPTION.getText(), "NSS-TODO List v 1.1", "Wrong page!!!");
		
			
		}

}
