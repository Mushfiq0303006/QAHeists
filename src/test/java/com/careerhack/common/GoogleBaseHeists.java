package com.careerhack.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBaseHeists {


	
	public	WebDriver driver;
		public void launchBrowser() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://google.com");
			driver.manage().window().maximize();
		}
		}
	
	
	
	

