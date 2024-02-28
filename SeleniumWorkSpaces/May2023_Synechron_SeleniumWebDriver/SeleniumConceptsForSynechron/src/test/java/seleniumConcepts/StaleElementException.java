package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StaleElementException {
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
	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*//signin
		WebElement sigin = driver.findElement(By.name("proceed"));
		driver.navigate().refresh();
		System.out.println("Text ="+driver.findElement(By.name("proceed")).getAttribute("text"));
		driver.navigate().refresh();
		System.out.println("font size ="+driver.findElement(By.name("proceed")).getCssValue("font-size"));
		driver.navigate().refresh();
		System.out.println("size ="+driver.findElement(By.name("proceed")).getSize());
		driver.navigate().refresh();
		driver.findElement(By.name("proceed")).click();*/
		PageClass p = PageFactory.initElements(driver, PageClass.class);
		System.out.println("Text="+p.signin.getAttribute("text"));
		driver.navigate().refresh();
		System.out.println("font size ="+p.signin.getCssValue("font-size"));
		driver.navigate().refresh();
		System.out.println("size ="+p.signin.getSize());
		driver.navigate().refresh();
		p.signin.click();
		
}
}