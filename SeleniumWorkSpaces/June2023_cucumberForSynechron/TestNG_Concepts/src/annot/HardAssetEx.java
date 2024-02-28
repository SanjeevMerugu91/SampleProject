package annot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssetEx {
	@Test
	public void testCase1(){
		int ExpImg=10;
		int ActImg=12; // selenium code 
		
		System.out.println("A");
		try{
		Assert.assertEquals(ActImg, ExpImg);
		}catch(Throwable t){
			System.out.println(t.getMessage());
		}
		System.out.println("B");
		
	}
}
