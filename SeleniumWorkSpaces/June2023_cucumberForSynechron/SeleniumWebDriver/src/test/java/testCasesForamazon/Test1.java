package testCasesForamazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {
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
		driver.get("https://www.amazon.com/");// open url
		driver.manage().window().maximize(); //maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		((JavascriptExecutor)driver).executeScript("document.querySelector(\"#nav-xshop > a:nth-child(2)\").click()");
		//click on dont change
		WebElement dontchange = driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input"));
		dontchange.click();
		//click on todaysdeal
		driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		//select furniture checkbox
		driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[18]/label/input")).click();
		//click on first item
		driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div/div/img")).click();
		//click on first item in sublist
		driver.findElement(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[1]/a/div")).click();
		//click on add2cart 
		driver.findElement(By.id("add-to-cart-button")).click();
		//verifysucessmsg
		String text = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
		System.out.println("Actual text ="+text);
		st.assertEquals(text, "Added to Cart");
		//close Browser
		driver.quit();
		st.assertAll();
		
	}
}

