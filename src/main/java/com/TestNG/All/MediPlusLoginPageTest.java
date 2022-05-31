package com.TestNG.All;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MediPlusLoginPageTest {
	@Test(alwaysRun=true)
	public void MPLPT() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
