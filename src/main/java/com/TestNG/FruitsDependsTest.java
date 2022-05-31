package com.TestNG;

import org.testng.annotations.Test;

public class FruitsDependsTest {
	
	@Test(dependsOnMethods= {"carrot"})
public void apple() {
	System.out.println("apple");
}
	@Test(dependsOnMethods= {"orange"})
	public void grapes() {
		System.out.println("grapes");
	}
@Test(dependsOnMethods= {"Grapes"})
public void banana() {
	System.out.println("banana");
}
@Test(dependsOnMethods= {"banana"})
public void orange() {
	System.out.println("orange");
}
@Test(dependsOnMethods= {"apple"})
public void carrot() {
	System.out.println("carrot");
}
}

