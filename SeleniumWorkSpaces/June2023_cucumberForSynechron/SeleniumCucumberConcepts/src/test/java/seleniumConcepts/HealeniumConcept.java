package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.epam.healenium.SelfHealingDriver;

public class HealeniumConcept {
	
		//WebDriver driver;
		//String Browser ="edge";
		@Test
		public void testCase1() throws InterruptedException{
		
			/*if(Browser.equalsIgnoreCase("chrome")){
				driver=new ChromeDriver();
			}else if(Browser.equalsIgnoreCase("firefox")){
				driver=new FirefoxDriver();
			}else if(Browser.equalsIgnoreCase("edge")){
				driver=new EdgeDriver();
			}*/
			WebDriver delegate = new ChromeDriver();
			//create Self-healing driver
			SelfHealingDriver driver = SelfHealingDriver.create(delegate);
			driver.get("https://www.google.com/");// open url
			driver.manage().window().maximize(); //maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//click on gmail
			driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	}
}
