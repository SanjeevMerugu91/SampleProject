package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annot {
	@Test
	public void testCase1(){
		//selenium code to composemail
		System.out.println("composemail");
	}
	
	@Test
	public void testCase2(){
		//selenium code to savemail
		System.out.println("savemail");
	}
	@Test
	public void testCase3(){
		//selenium code to Deletemail
		System.out.println("Deletemail");
	}
	@BeforeMethod
	public void bmethod1(){
		System.out.println("openBrowser1,url,Login");
	}
	@BeforeMethod
	public void bmethod2(){
		System.out.println("openBrowser2,url,Login");
	}
	@AfterMethod
	public void amethod(){
		System.out.println("Logout,closeBrowser");
	}
	@BeforeClass
	public void bclass(){
		System.out.println("Start server");
	}
	@AfterClass
	public void aclass(){
		System.out.println("Shutdown server");
	}
}
