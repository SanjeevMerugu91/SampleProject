package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Itemsublistpage {
	@FindBy(xpath="//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[1]/a/div") 
	public WebElement firstiteminsublist;
	
	public void clickonfirstiteminsublist(){
		try{
		firstiteminsublist.click();
		}catch(Throwable t){}
	}
}
