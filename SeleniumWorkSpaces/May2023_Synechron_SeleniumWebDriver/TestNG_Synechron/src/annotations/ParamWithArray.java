package annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamWithArray {

	@Test(dataProvider="getdata1")
	public void testCase1(String cname,String cpassword){
		//selenium code to login
		System.out.println(cname+" password is "+cpassword);

	}

	@DataProvider
	public Object[][] getdata1(){
		Object obj[][]=new Object[3][2];
		
		obj[0][0]="Name1";
		obj[0][1]="password1";
		
		obj[1][0]="Name2";
		obj[1][1]="password2";
		
		obj[2][0]="Name3";
		obj[2][1]="password3";
		
		return obj;
	}
	
}
