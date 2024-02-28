package javaConcepts;

import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.Test;

public class WorkWithproperties {
	@Test
	public void workWithprop() throws Throwable{
		
		Properties prop=new Properties();
		prop.load(new FileReader("src\\test\\java\\javaConcepts\\Global.properties"));
		
		System.out.println(prop.getProperty("Browsertype"));
		System.out.println(prop.getProperty("url"));
	}
}
