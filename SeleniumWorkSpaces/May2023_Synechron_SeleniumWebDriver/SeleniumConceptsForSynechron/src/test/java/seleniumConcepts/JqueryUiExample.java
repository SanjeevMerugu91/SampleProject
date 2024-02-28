package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JqueryUiExample {
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
	
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//switch driver ref to  frame
		//driver.switchTo().frame("demo-frame");
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(0);
		//click on item4
		driver.findElement(By.xpath("//li[text()='Item 4']")).click();
		//switch driver ref to main window
		driver.switchTo().defaultContent();
		//click on droppable
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		
		/*
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		
		driver.switchTo().frame(0);
		driver.switchTo().parentFrame().switchTo().parentFrame();
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(0).switchTo().frame(1).switchTo().frame(2)*/
}
}