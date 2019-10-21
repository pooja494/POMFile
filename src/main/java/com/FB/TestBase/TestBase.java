package com.FB.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			FileInputStream ip=new FileInputStream("E:\\Pooja QA\\com.facebook_login\\src\\main\\java\\com\\facebook\\configuration\\orange.properties");
			prop =new Properties();
			prop.load(ip);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void initialization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("systemproperty1"),prop.getProperty("systemproperty2"));
			driver=new ChromeDriver();
			
		}
		
		//Maximize Browser Window
		driver.manage().window().maximize();
		//Delete cookies
		driver.manage().deleteAllCookies();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
