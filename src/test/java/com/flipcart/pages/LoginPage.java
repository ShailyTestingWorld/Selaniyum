package com.flipcart.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	 public WebDriver driver;
		//construtor
		  
		 public LoginPage(WebDriver driver) {
			 this.driver=driver;	  
		 }
		
		@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
		 WebElement emailid;
		 
		@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
		 WebElement pass;
		
		@FindBy(xpath="//button[@class='L0Z3Pu']")
		WebElement loginbtn;
		
		// action method 
		public void login(String email, String pwd) {
			emailid.sendKeys(email);
			pass.sendKeys(pwd);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			loginbtn.click();
			
		}
	

}
