package testCasesForAmazon;

import org.testng.annotations.Test;

import testBase.TestBase;

public class Test2 extends TestBase{
	@Test
	public void testCase2() throws Throwable{

		
		hp.clickondontchange();
		hp.clickontodaysdeal();
		dp.selectcheckbox("movie");
		ip.clickonfirstitem();
		isp.clickonfirstiteminsublist();
		acp.clickonadd2cart();
		sp.verifysucessmsg();
		
	//	closeBrowser();
	}
}
