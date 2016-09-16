package com.week2;

public class Singleton2 {
	private static Singleton2[] objs = new Singleton2[3];
	private static int objId = 0;
	private Singleton2()
	{
		System.out.println("Object Created. Object ID "+objId);
	}
	public static Singleton2 getObject(){
		if(objs[objId % 3] == null)
			return objs[++objId-1 % 3] = new Singleton2();
		System.out.println("Using old object. ID "+(objId%3));
		return objs[objId%3];
	}
}
