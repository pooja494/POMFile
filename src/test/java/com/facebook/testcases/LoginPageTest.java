package com.facebook.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.FB.TestBase.TestBase;
import com.facebook.pages.Login_page;


public class LoginPageTest extends TestBase {
	
	Login_page loginpage;
	public LoginPageTest()
	{
	super();
	}

@BeforeSuite
public void setup()
{
	initialization();
	loginpage=new Login_page();
}

@Test 
public void verifyTitletest()
{
	String title=loginpage.verifyTitle();
	Assert.assertEquals(title, "Facebook-login or Signup");
}

@Test 
public void verifyLoginTest()
{
	loginpage.login();
}

@AfterSuite
public void tearDown()
{
	driver.quit();
}
}