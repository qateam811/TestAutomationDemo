package com.selenium.git.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitPractice {

	WebDriver driver;
	
	@Test
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");		
	}
	

	@Test
	public void openBrowser2()
	{
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");		
	}	
}
