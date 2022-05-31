package com.TestNG;

import org.testng.annotations.Test;

public class FruitsPriorityMethod {
	@Test(priority=0)
public void apple() {
	System.out.println("apple");
}
	@Test(priority=2)
	public void grapes() {
		System.out.println("grapes");
	}
@Test(priority=1)
public void banana() {
	System.out.println("banana");
}
@Test(priority=3)
public void orange() {
	System.out.println("orange");
}
@Test(priority=4)
public void Carrot() {
	System.out.println("Carrot");
}
}

