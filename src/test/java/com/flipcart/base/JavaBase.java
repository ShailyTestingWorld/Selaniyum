package com.flipcart.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.flipcart.utility.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaBase {
	
	 public String browser;
	    public  static WebDriver driver;
	    public  SoftAssert soft;
	    
	@BeforeSuite
	 public void browserSetup(){
		      browser =PropertyReader.getConfigProperty("BROWSER");
		 
		switch(browser) {
		
		case" chrome":
		{
			WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		}
		break;
		
		case"safari":
			
		{
			WebDriverManager.safaridriver().setup();
			  driver=new SafariDriver();
			
		}
		
		break;
		
		case"edge":
		{
			WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
		}
		
		break;
		
		default:
		
			WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  break;
		}
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		
		}	
	
	 // send keys main we need two thing xpath webelemt jis main value send hogee aur value kya send hogee 
	  public static void sendkeys(WebElement element,String text) {
		    element.sendKeys(text);
	  }
	  
	  public static void click(WebElement element) {
			 element.click();
		}
	
//	@AfterSuite
//	  public void tearDown() {
//		  
//		  driver.close();
//	  }
		 
	@BeforeMethod
	public  void softAssert() {	
		 soft=new SoftAssert();
		
	
	}
}
