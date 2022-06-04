package com.flipcart.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private static Properties envProperties=new Properties();
	  private static Properties configProperties=new Properties();
	
	 static {
		 
		   try {
			FileInputStream env=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//flipcart//properties//env.properties");   						
			                   envProperties.load(env);  
			                   
			  FileInputStream configProperty=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//flipcart//properties//"+envProperties.getProperty("env")+"-config.properties");                 
			                configProperties.load(configProperty);
			        
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
	
 public static String getConfigProperty(String key) {
	  return configProperties.getProperty(key);

	 
 }
	 
	 


}
