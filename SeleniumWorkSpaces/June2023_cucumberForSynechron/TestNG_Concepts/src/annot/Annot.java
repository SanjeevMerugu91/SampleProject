package annot;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Annot {
	@Test
	public void testCase1(){
		//selenium code composemail
		System.out.println("composemail");
	}
	
	@Test
	public void testCase2(){
		//selenium code Savemail
	//	System.out.println("Savemail");
		throw new SkipException("Reason for skipping this testCase");
	}
	@Test
	public void testCase3(){
		//selenium code Deletemail
		System.out.println("Deletemail");
	}
}

