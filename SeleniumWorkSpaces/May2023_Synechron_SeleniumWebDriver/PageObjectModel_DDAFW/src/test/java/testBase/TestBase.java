package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.Add2cartpage;
import pageFactory.Departmentpage;
import pageFactory.Homepage;
import pageFactory.Itemspage;
import pageFactory.Itemsublistpage;
import pageFactory.Sucessmsgpage;

public class TestBase {
	
	public static Properties prop;
	public static String Browser;
	public static WebDriver driver;
	public static SoftAssert st;
	public static Homepage hp;
	public static Departmentpage dp;
	public static Itemspage ip;
	public static Itemsublistpage isp;
	public static Add2cartpage acp;
	public static Sucessmsgpage sp;
	
	@BeforeSuite
	public static void openBrowser() throws Throwable{
		st=new SoftAssert();
		prop=new Properties();
		prop.load(new FileReader("src\\test\\java\\config\\Global.properties"));
		Browser=prop.getProperty("Browser");
		System.out.println("Browser= "+Browser);
		if(Browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver(); //openBrowser
		else if(Browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if(Browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClass();
	}
	public static void initClass(){
		 hp = PageFactory.initElements(driver, Homepage.class);
		 dp = PageFactory.initElements(driver, Departmentpage.class);
		 ip = PageFactory.initElements(driver, Itemspage.class);
		 isp = PageFactory.initElements(driver, Itemsublistpage.class);
		 acp = PageFactory.initElements(driver, Add2cartpage.class);
		 sp = PageFactory.initElements(driver, Sucessmsgpage.class);
		
	}
	@AfterSuite
	public static void closeBrowser(){
		driver.quit();
	}
}
