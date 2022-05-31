package com.TestNG.All;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JqueryPageTest {
	@Test(alwaysRun=true)
	public void JQPT() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/switchClass/");
		driver.manage().window().maximize();
		driver.close();
	}

}
