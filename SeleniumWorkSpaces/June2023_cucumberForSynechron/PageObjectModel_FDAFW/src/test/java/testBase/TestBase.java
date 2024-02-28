package testBase;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import pageFactory.Add2cartpage;
import pageFactory.Deparmentpage;
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
	public static Deparmentpage dp;
	public static Itemspage ip;
	public static Itemsublistpage isp;
	public static Add2cartpage acp;
	public static Sucessmsgpage sp;
	
	
	public static void openBrowser() throws Throwable{
		st=new SoftAssert();
		prop=new Properties();
		prop.load(new FileReader("src\\test\\java\\config\\Global.properties"));
		Browser=prop.getProperty("Browser");
		System.out.println("choosen browser is "+Browser);
		if(Browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(Browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		driver.get(prop.getProperty("url"));// open url
		driver.manage().window().maximize(); //maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initclass();
	}
	
	public static void initclass(){
		 hp = PageFactory.initElements(driver, Homepage.class);
		 dp = PageFactory.initElements(driver, Deparmentpage.class);
		 ip = PageFactory.initElements(driver, Itemspage.class);
		 isp = PageFactory.initElements(driver, Itemsublistpage.class);
		 acp = PageFactory.initElements(driver, Add2cartpage.class);
		 sp = PageFactory.initElements(driver, Sucessmsgpage.class);
	}

	public static void closeBrowser(){
		driver.quit();
		st.assertAll();
	}
}
