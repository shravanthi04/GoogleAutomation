package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonPageTest {
	@Test (invocationCount=2,invocationTimeOut=30000)
public void APL() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String s="https://www.amazon.com/";
		driver.get(s);
		driver.manage().window().maximize();
	}
}
