package com.ERP_Techschool.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase
{
	public FileInputStream fis;
	public Properties property;
	

	WebDriver driver;
	
	
	
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Lib//chromedriver_win32-2.29//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("launched browser");
		driver.get("https://www.google.com");
	}
	
	public String loadProperty() throws Exception
	{
		fis=new FileInputStream(System.getProperty("user.dir")+"com.ERP_Techschool.config//config.properties");
		property.load(fis);
		String data=property.getProperty("url");
		return data;
	}
	
	
}
