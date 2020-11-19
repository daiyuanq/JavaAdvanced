package com.daiinfo.javaadvanced.know9.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 使用饿汉式单例模式获取对象
		HungrySingleton hungrySingleton = HungrySingleton.getInstance();
		hungrySingleton.showMessage();
		
		// 使用懒汉式模式获取对象
		LazySingleton lazySingleton=LazySingleton.getInstance();
		lazySingleton.showMessage();

	}

}
