package com.daiinfo.javaadvanced.know3;

public class Parent {
	public static String parentStaticField = "父类静态变量";
	public String parentNormalField = "父类普通变量";

	static {
		System.out.println(parentStaticField);
		System.out.println("父类静态块");
	}

	{
		System.out.println(parentNormalField);
		System.out.println("父类普通块");
	}

	public Parent() {
		System.out.println("父类构造方法");
	}
}
