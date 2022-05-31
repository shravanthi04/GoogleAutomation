package com.TestNG.All;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IHGPageTest {
	@Test(alwaysRun=true)
	public void IHGPT() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
}
}