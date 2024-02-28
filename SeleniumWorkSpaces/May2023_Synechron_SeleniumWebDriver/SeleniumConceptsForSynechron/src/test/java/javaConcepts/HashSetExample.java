package javaConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Main;

public class HashSetExample {
	@Test
	public void testCase1(){
		Set<String> s=new HashSet<String>();
		
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("B");
		s.add("C");
		
		System.out.println("size ="+s.size());
		
		/*for(String x : s){
			System.out.println(x);
		}*/
		
		Iterator<String> it = s.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	}
}
