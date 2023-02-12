package com.ef;

public class Simple {
	private static final Simple simpleObject = new Simple();
	
    private Simple() {
		System.out.println("This is private constructor ");	
	}

	//this is static factory method and it will use to inject the dependency
	public static Simple getSimple() {
		System.out.println("This is factory method");
		return simpleObject;//it returns instance of simple class and so it is called factory method
	}
	public void display() {
		System.out.println("Welcome to factory method ");
	}
}
