package com.TestNG.All;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NikePageTest {
	@Test(alwaysRun=true)
	public void NPL() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nike.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
