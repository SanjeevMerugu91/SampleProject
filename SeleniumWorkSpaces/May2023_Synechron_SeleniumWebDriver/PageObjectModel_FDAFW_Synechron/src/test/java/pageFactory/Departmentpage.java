package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Departmentpage {

	@FindBy(xpath="//span[text()=\"Men's Watches\"]")
	public WebElement menswatches;
	
	@FindBy(xpath="//span[text()=\"Movies & TV\"]")
	public WebElement movie;
	
	@FindBy(xpath="//span[text()=\"Kitchen & Dining\"]")
	public WebElement kitchen;
	
	public void selectcheckbox(String checkbox){
		if(checkbox.equalsIgnoreCase("menswatches"))
			menswatches.click();
		else if(checkbox.equalsIgnoreCase("movie"))
			movie.click();
		else if(checkbox.equalsIgnoreCase("kitchen"))
			kitchen.click();
	}
	
	}
