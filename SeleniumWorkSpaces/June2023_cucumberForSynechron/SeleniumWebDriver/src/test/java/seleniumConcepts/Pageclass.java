package seleniumConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageclass {

	@FindBy(xpath="//*[@id=\"root_2\"]")
	public WebElement news;
}
