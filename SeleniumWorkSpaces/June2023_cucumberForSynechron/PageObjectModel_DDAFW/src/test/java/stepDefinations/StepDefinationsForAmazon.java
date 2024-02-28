package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kotlin.jvm.internal.FunctionReferenceImpl;
import pageFactory.Add2cartpage;
import pageFactory.Deparmentpage;
import pageFactory.Homepage;
import pageFactory.Itemspage;
import pageFactory.Itemsublistpage;
import pageFactory.Sucessmsgpage;
import testBase.TestBase;

public class StepDefinationsForAmazon extends TestBase{
	@BeforeAll
	public static void beforeAllScenarios() throws Throwable{
		openBrowser();
	}
	@AfterAll
	public static void afterAllScenarios(){
		
		closeBrowser();
		
	}
	@Given("user is in the department page")
	public void user_is_in_the_department_page() {
		//Homepage hp=new Homepage();
		//Homepage hp = PageFactory.initElements(driver, Homepage.class);
		hp.clickondontchange();
		hp.clickontodaysdeal();
	}
	/*@When("user select {string} department and select item to add")
	public void user_select_department_and_select_item_to_add(String checkbox) {
		Deparmentpage dp = PageFactory.initElements(driver, Deparmentpage.class);
		Itemspage ip = PageFactory.initElements(driver, Itemspage.class);
		Itemsublistpage isp = PageFactory.initElements(driver, Itemsublistpage.class);
		
		dp.selectcheckbox(checkbox);
		ip.clickonfirstitem();
		isp.clickonfirstiteminsublist();
	
	}*/
	@When("^user select (.+) department and select item to add$")
	public void user_select_movie_and_tv_department_and_select_item_to_add(String checkbox) {
		dp.selectcheckbox(checkbox);
		ip.clickonfirstitem();
		isp.clickonfirstiteminsublist();
	}
	@And("clicks on add2cart button")
	public void clicks_on_add2cart_button() {
		//Add2cartpage acp = PageFactory.initElements(driver, Add2cartpage.class);
		acp.clickonadd2cart();
	}
	@Then("sucessfully an item to be added to the cart")
	public void sucessfully_an_item_to_be_added_to_the_cart() {
		//Sucessmsgpage sp = PageFactory.initElements(driver, Sucessmsgpage.class);
		sp.verifysucessmsg();
	}
	
	@AfterStep
	public static void tearDown(Scenario scenario) {
	 
	       	 System.out.println("scenario name ="+scenario.getName());
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	}
	
}
