package testCasesForAmazon;

import org.testng.annotations.Test;

import testBase.TestBase;

public class Test3 extends TestBase{
	@Test
	public void testCase3() throws Throwable{
	
		hp.clickondontchange();
		hp.clickontodaysdeal();
		dp.selectcheckbox("kitchen");
		ip.clickonfirstitem();
		isp.clickonfirstiteminsublist();
		acp.clickonadd2cart();
		sp.verifysucessmsg();
		
		//closeBrowser();
	}
}
