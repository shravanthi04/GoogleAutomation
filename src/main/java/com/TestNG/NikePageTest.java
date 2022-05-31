package com.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NikePageTest {
	@Test(groups= {"Sanity"})
	public void NPL() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nike.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
