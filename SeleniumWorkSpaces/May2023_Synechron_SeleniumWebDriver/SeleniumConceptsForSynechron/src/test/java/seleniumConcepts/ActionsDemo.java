package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActionsDemo {
	WebDriver driver;
	String Browser="firefox";
	@Test
	public void testCase1() throws Throwable{
		SoftAssert st=new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver(); //openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if(Browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
	
		driver.get("https://www.drikpanchang.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//mouse over on panchang
		WebElement panchang = driver.findElement(By.xpath("//a[text()='Panchang']"));
		
		Actions action=new Actions(driver);
		//action.click(); //left click
		//action.click(target) //left click on target webelement
		//action.contextClick(target) //Right click
		//action.doubleClick(target);
		//action.dragAndDrop(source, target)
		//action.clickAndHold(src).moveToElement(tar).release()
		
	//	action.moveToElement(panchang).build().perform();
	//	action.click(driver.findElement(By.xpath("//*[@id=\"dp-menu\"]/li[3]/div[2]/div[2]/a[5]"))).build().perform();
		
		//scroll down to pandith image
	//	action.moveToElement(driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[8]/img"))).build().perform();
	//	action.contextClick(panchang).build().perform();
		/*
		for(int i=1;i<=10;i++){
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		}
		*/
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
}
}