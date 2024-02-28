package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testBase.TestBase;
import xls.ShineXlsReader;

public class Test123 extends TestBase{
	@Test(dataProvider="getdata")
	public void testCase123(String checkbox){
		hp.clickondontchange();
		hp.clickontodaysdeal();
		dp.selectcheckbox(checkbox);
		ip.clickonfirstitem();
		isp.clickonfirstiteminsublist();
		acp.clickonadd2cart();
		sp.verifysucessmsg();
	}
	@DataProvider
	public Object[][] getdata(){
		ShineXlsReader xls=new ShineXlsReader("src\\test\\java\\excelFiles\\TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int columnCount = xls.getColumnCount("Sheet1");
		Object obj[][]=new Object[rowCount-1][columnCount];
		for(int i=2;i<=rowCount;i++){
			for(int j=0;j<columnCount;j++){
				obj[i-2][j]=xls.getCellData("Sheet1", j, i);
			}
		}
		return obj;
	}
}
