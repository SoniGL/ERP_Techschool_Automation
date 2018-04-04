package com.testcases;

import org.testng.annotations.Test;

import com.ERP_Techschool.base.TestBase;

public class Student extends TestBase
{
	TestBase testbase;
	
	@Test
	public void abc()
	{
		testbase=new TestBase();
		testbase.launchBrowser();
	}

}
