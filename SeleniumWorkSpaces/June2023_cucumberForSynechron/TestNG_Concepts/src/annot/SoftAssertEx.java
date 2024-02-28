package annot;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

	@Test
	public void testCase1(){
		SoftAssert st=new SoftAssert();
		int ExpImg=10;
		int ActImg=12; // selenium code 
		
		System.out.println("A");
		st.assertEquals(ActImg, ExpImg,"comparing number of links");
		st.assertEquals("Bangalore", "Bengaluru","comparing two strings");
		System.out.println("B");
		
		st.assertAll();
		System.out.println("C");
		
		
}
}