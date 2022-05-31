package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTesting {

		@Test(dataProvider="Authentication")
			public void dpr(String id1,String id2) {
				System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.name("txtUsername")).sendKeys(id1);
				driver.findElement(By.id("txtPassword")).sendKeys(id2);
				driver.findElement(By.className("button")).click();
	}
@DataProvider(name="Authentication")
public Object[][] credentails()
{
	return new Object[][] {{"Admin","admin123"}};
}
}
