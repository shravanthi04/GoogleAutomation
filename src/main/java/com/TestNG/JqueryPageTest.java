package com.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JqueryPageTest {
	@Test(groups= {"Smoke"})
	public void JQPT() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/switchClass/");
		driver.manage().window().maximize();
		driver.close();
	}

}
