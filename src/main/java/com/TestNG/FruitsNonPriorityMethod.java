package com.TestNG;

import org.testng.annotations.Test;

public class FruitsNonPriorityMethod {
	@Test()
public void apple() {
	System.out.println("apple");
}
	@Test(priority=4)
	public void grapes() {
		System.out.println("grapes");
	}
@Test()
public void banana() {
	System.out.println("banana");
}
@Test(priority=2)
public void orange() {
	System.out.println("orange");
}
@Test(priority=3)
public void Carrot() {
	System.out.println("Carrot");
}
}

