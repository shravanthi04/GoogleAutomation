package com.TestNG.All;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLoginPageTest {
	
@Test(enabled=false)
public void FBLogin() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe" );
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
}
}
