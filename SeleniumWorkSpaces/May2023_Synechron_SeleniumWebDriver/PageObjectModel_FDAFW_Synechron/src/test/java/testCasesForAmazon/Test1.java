package testCasesForAmazon;

import org.testng.annotations.Test;

import testBase.TestBase;

public class Test1 extends TestBase{
	@Test
	public void testCase1() throws Throwable{
		//openBrowser();
		//Homepage hp=new Homepage();
		
		
		hp.clickondontchange();
		hp.clickontodaysdeal();
		dp.selectcheckbox("menswatches");
		ip.clickonfirstitem();
		isp.clickonfirstiteminsublist();
		acp.clickonadd2cart();
		sp.verifysucessmsg();
		
		//closeBrowser();
	}
}
