package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShadowRootExample {
	WebDriver driver;
	String Browser ="edge";
	@Test
	public void testCase1() throws InterruptedException{
		SoftAssert st=new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(Browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		driver.get("https://www.msn.com/en-in");// open url
		driver.manage().window().maximize(); //maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		//click on flipkart
		((JavascriptExecutor)driver).executeScript("document.querySelector(\"body > fluent-design-system-provider > entry-point\").shadowRoot.querySelector(\"#entry-point-hp-wc-root-wrapper > div.content-container > div.me-stripe-container > me-stripe\").shadowRoot.querySelector(\"div > msft-horizontal-card-slider > me-stripe-tile:nth-child(1)\").shadowRoot.querySelector(\"div > a > div.me-stripe-title-container > div > div.me-stripe-title-main\").click()");
}
}