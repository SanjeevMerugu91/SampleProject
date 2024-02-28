package annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneMoreMethod {

	@Test
	public void testCase1(){
		SoftAssert st=new SoftAssert();
		String expstr="Bangalore";
		String actstr="Bengalooru";
		System.out.println("A");
		if(!expstr.equals(actstr)){
			st.fail("Strings are mis-matching");
		}
		System.out.println("B");
		
		st.assertAll();
}
}
