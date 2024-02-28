package seleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkWithTabsAndWindows {
	WebDriver driver;
	String Browser="chrome";
	@Test
	public void testCase1() throws Throwable{
		SoftAssert st=new SoftAssert();
		if(Browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver(); //openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if(Browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
	
		driver.get("https://www.msn.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on Flipkart
		//driver.findElement(By.xpath("//*[@id=\"entry-point-hp-wc-root-wrapper\"]/div[1]/div[1]/me-stripe//div/msft-horizontal-card-slider/me-stripe-tile[1]//div/a/div[2]/div/div[2]/div")).click();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"body > fluent-design-system-provider > entry-point\").shadowRoot.querySelector(\"#entry-point-hp-wc-root-wrapper > div.content-container > div.me-stripe-container > me-stripe\").shadowRoot.querySelector(\"div > msft-horizontal-card-slider > me-stripe-tile:nth-child(1)\").shadowRoot.querySelector(\"div > a > div.me-stripe-title-container > div > div.me-stripe-title-main\").click();");
		

		//driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		Iterator<String> it = allids.iterator();
		String mid = it.next();
		String t1 = it.next();
		//switch driver ref to tab window
		driver.switchTo().window(t1);
		//Enter text in the flipkart edit box
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("tester");
		driver.close(); //close tab
		//switch driver ref to back main main window
		//driver.switchTo().defaultContent();
		driver.switchTo().window(mid);
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"body > fluent-design-system-provider > entry-point\").shadowRoot.querySelector(\"#entry-point-hp-wc-root-wrapper > div.content-container > div.me-stripe-container > me-stripe\").shadowRoot.querySelector(\"div > msft-horizontal-card-slider > me-stripe-tile:nth-child(3)\").shadowRoot.querySelector(\"div > a > div.me-stripe-title-container > div > div\").click()");
		
}
}