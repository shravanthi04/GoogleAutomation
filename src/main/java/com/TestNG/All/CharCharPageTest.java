package com.TestNG.All;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CharCharPageTest {
	
	@Test(enabled=false)
	public void CCPT() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
	}

}
