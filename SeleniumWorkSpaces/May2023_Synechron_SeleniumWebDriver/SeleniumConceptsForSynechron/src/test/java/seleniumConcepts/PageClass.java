package seleniumConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageClass {

	@FindBy(name="proceed")
	public WebElement signin;
}
