package com.daiinfo.javaadvanced.know3;

public class Child extends Parent{
	public static String childStaticField = "子类静态变量";
	public String childNormalField = "子类普通变量";

	static {
		System.out.println(childStaticField);
		System.out.println("子类静态块");
	}

	{
		System.out.println(childNormalField);
		System.out.println("子类普通块");
	}

	public Child() {
		System.out.println("子类构造方法");
	}
}
