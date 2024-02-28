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

public class StaleElementExceptionExample {
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
		driver.get("https://www.yahoo.com/");// open url
		driver.manage().window().maximize(); //maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//News
		/*//WebElement news = driver.findElement(By.xpath("//*[@id=\"root_2\"]"));
		driver.navigate().refresh(); // many reason
		System.out.println("x and y ="+driver.findElement(By.xpath("//*[@id=\"root_2\"]")).getLocation());
		driver.navigate().refresh(); 
		System.out.println("font size ="+driver.findElement(By.xpath("//*[@id=\"root_2\"]")).getCssValue("font-size"));
		driver.navigate().refresh(); 
		System.out.println("size ="+driver.findElement(By.xpath("//*[@id=\"root_2\"]")).getSize());
		driver.navigate().refresh(); 
		System.out.println("text ="+driver.findElement(By.xpath("//*[@id=\"root_2\"]")).getText());
		driver.navigate().refresh(); 
		System.out.println("tag name ="+driver.findElement(By.xpath("//*[@id=\"root_2\"]")).getTagName());
		driver.navigate().refresh(); 
		driver.findElement(By.xpath("//*[@id=\"root_2\"]")).click();*/
		
		Pageclass p = PageFactory.initElements(driver, Pageclass.class);
		driver.navigate().refresh();
		System.out.println("Location ="+p.news.getLocation());
		driver.navigate().refresh();
		System.out.println("font size ="+p.news.getCssValue("font-size"));
		driver.navigate().refresh();
		System.out.println("text ="+p.news.getText());
		driver.navigate().refresh();
		p.news.click();
		
}
}