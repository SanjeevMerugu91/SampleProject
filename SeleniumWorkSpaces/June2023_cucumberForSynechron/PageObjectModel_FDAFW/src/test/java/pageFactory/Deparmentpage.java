package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Deparmentpage {

	@FindBy(xpath="//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[18]/label/input")
	public WebElement furniture;
	
	@FindBy(xpath="//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[36]/label/input")
	public WebElement menswatches;
	
	@FindBy(xpath="//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[37]/label/input")
	public WebElement movieandtv;
	
	public void selectcheckbox(String checkbox){
		if(checkbox.equalsIgnoreCase("furniture"))
			furniture.click();
		else if(checkbox.equalsIgnoreCase("menswatches"))
			menswatches.click();
		else if(checkbox.equalsIgnoreCase("movieandtv"))
			movieandtv.click();
		
	}
	
}
