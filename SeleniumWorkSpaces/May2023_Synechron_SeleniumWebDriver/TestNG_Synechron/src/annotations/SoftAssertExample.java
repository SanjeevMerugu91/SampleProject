package annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertExample {

	@Test
	public void testCase1(){
		SoftAssert st=new SoftAssert();
		int Explinks=10;
		int Actlinks=12; // Selenium code
		System.out.println("A");
		st.assertEquals(Actlinks, Explinks,"comparing number of links");
		st.assertEquals("Bangalore", "Bengalooru","comparing two strings");
		System.out.println("B");
		
		
		st.assertAll();
		System.out.println("C");
}
	
}