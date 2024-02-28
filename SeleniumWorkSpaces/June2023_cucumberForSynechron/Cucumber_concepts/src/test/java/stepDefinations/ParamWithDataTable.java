package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.When;
import xls.ShineXlsReader;

public class ParamWithDataTable {
	@When("^user entered valid username as (.+) and password as (.+)$")
	public void user_entered_valid_username_as_and_password_as(String name,String password) {
	    System.out.println("user entered username as "+name+" and password as "+password);
	}
	@When("^user entered login credential from (.+)$")
	public void user_entered_login_credential_from(Integer rownum) {
		ShineXlsReader xls= new ShineXlsReader("TestData.xlsx");
		String cname = xls.getCellData("Sheet1", 0, rownum);
		String cpassword = xls.getCellData("Sheet1", 1, rownum);
		System.out.println("user entered username as "+cname+" and password as "+cpassword);
	}
	@Before
	public void beforeEachScenario(){
		System.out.println("-----------------------------OpenBrowser,Enter url-------------------------- ");
	}
	@After
	public void afterEachScenario(){
		System.out.println("-----------------------------logout,CloseBrowser-------------------------- ");
	}
	@BeforeAll
	public static void beforeAllscenarios(){
		System.out.println("***************************Start server...*************************************");
	}
	@AfterAll
	public static void afterAllscenarios(){
		System.out.println("****************************Shutdown server...***********************************");
	}
	@BeforeStep("@smoke")
	public void beforeEachStep(){
		System.out.println("----------------Takescreen shot before step");
	}
	@AfterStep("@smoke")
	public void afterEachStep(){
		System.out.println("-------------------------Takescreen shot after step");
	}
}
