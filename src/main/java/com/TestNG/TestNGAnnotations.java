package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@BeforeSuite
public void one() {
	System.out.println("one");
}
	@AfterSuite
public void two() {
	System.out.println("two");
}
@BeforeMethod
public void three() {
	System.out.println("three");
}
	@AfterMethod
public void four() {
	System.out.println("four");
}
	@BeforeTest
public void five() {
	System.out.println("five");
}
	@AfterTest
public void six() {
	System.out.println("six");
}
	@BeforeClass
public void seven() {
	System.out.println("seven");
}
	@AfterClass
public void eight() {
	System.out.println("eight");
}

	@Test
public void nine() {
	System.out.println("nine");
}
}