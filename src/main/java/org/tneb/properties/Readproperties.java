package org.tneb.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.testng.annotations.BeforeTest;




public class Readproperties {
	public static String url, username,password;
	
	@BeforeTest
	public void readingproperties() 
	{
		Properties Prop = new Properties();
		try {
			Prop.load(new FileInputStream("./src/main/resources/Properties/Url&Login.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		url = Prop.getProperty("url");
		username = Prop.getProperty("username");
		password = Prop.getProperty("password");
		
		//return url;
		//return Prop;
		//String Property = Prop.getProperty("url");
		//System.err.println(Property);
		
		
	}
	

}
