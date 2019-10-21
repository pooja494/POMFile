package com.facebook.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FB.TestBase.TestBase;

public class Login_page extends TestBase{
	
	@FindBy(id="email")
	WebElement uname;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")	
	WebElement loginbtn;
	
	public Login_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void login()
	{
		uname.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
	}
	
//	public int countLinks()
//	{
//		ArrayList<Object> al=new ArrayList<Object>(driver.findElements(By.tagName("a")));
//		int count=al.size();
//		return count;
//	}
//	
//	public int countimg()
//	{
//		ArrayList<Object> ai=new ArrayList<Object>(driver.findElements(By.tagName("img")));
//		int cnt=ai.size();
//		return cnt;
//	}

}
