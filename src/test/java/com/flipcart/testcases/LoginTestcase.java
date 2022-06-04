package com.flipcart.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipcart.base.JavaBase;
import com.flipcart.pages.LoginPage;
import com.flipcart.utility.PropertyReader;

public class LoginTestcase extends JavaBase {
	LoginPage	obj;
	@Test(priority=1)
	 public void openurl() {
		driver.get(PropertyReader.getConfigProperty("url"));
		  String  expect_url = PropertyReader.getConfigProperty("url");
		  
		   // verify with url
		String  actual_url = driver.getCurrentUrl();
	
	 Assert.assertEquals(actual_url, expect_url, " expect url and actaul url mismatch");
	     soft.assertAll();
	 }
	@Test(priority=2)
	public void login() {
		obj=PageFactory.initElements(driver,LoginPage.class );
	//call login method -and provide email value and password ,it will recive in page page 
	       obj.login(PropertyReader.getConfigProperty("email"),PropertyReader.getConfigProperty("pass"));
 
	}
	
	

}
