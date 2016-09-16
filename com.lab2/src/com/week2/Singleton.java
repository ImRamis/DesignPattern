package com.week2;

public class Singleton {
	private static Singleton obj = null;
	private Singleton(){
		System.out.println("Object Created!");
	}
	public static Singleton getObject(){
		if(obj == null)
			return obj = new Singleton();
		System.out.println("Using old object");
		return obj;
	}
}
