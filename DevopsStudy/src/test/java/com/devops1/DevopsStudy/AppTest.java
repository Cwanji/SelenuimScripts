package com.devops1.DevopsStudy;
import com.devops1.DevopsStudy.Facebook.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AppTest {
	
	//create an Instance of facebook class
	
	Facebook facebook = new Facebook();

	
	@BeforeTest
	
	public void setUp() throws Exception {
		// get systeminfo
		App.systemInfo();
		
		// Call the initialize method
		facebook.initialize();
		
	}
	
	
	@Test
	public void signUp() throws Exception {
		// Go to Url
		facebook.navigateToUrl();
		
		// create new user account
		facebook.facebookSignUp();
		
	}
	
	
	@AfterTest
	public void tearDown() throws Exception {
		// close the browser
		App.closeBrowser();
		
	}
	
    
}
