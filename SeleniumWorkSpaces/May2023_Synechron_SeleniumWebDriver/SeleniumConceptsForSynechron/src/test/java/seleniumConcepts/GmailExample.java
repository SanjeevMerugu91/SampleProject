package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GmailExample {
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
	
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1408307216%3A1683796664137622&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Af_xneGifHeRE05u-XUHycrMAEnFn2MNRgNy33ZJKZ6Ewpr-Tt03Ujjk7c2sFB2tuklNOovEN7VY&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//500msec
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2));
		//Enter wrong email id
		driver.findElement(By.name("identifier")).sendKeys("ouewruoueoru");
		//next 
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]"))));
		
		
		//print errro msg
		String text = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]")).getText();
		System.out.println("text ="+text);
}
}
