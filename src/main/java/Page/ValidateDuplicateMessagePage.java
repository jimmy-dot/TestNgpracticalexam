package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ValidateDuplicateMessagePage {

	// Element Library

	@FindBy(how = How.XPATH, using = "//a[text()='Nevermind']")
	WebElement NEVERMIND_OPTION;

	// Method to interact with the elements

	public void ValidateDuplicateMessage() {
		Assert.assertEquals(NEVERMIND_OPTION.getText(), "Nevermind", "Wrong page!!!");

	}

}
