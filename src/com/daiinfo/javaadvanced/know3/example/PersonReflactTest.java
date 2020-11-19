/**  
* @Title: PersonReflactTest.java
* @Package com.daiinfo.javaadvanced.know3.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午11:34:57
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know3.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
* @ClassName: PersonReflactTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午11:34:57
*/

public class PersonReflactTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 运行时获取Person类的Class对象
		Class<?> clazz1 = null;
		Class<?> clazz2 = null;
		Class<?> clazz3 = null;
		// 第一种方式 通过对象的getClass方法
		Person person = new Person("张", "男", "2010-09-10");
		clazz1 = person.getClass();
		// 第二种方式 通过类的Class属性
		clazz2 = com.daiinfo.javaadvanced.know3.example.Person.class;
		// 第三种方式 通过Class类的静态方法forName()加载类
		try {
			clazz3 = Class.forName("com.daiinfo.javaadvanced.know3.example.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Class<?> clazz = null;
		try {
			System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
			clazz = Class.forName("com.daiinfo.javaadvanced.know3.example.Person", false,
					ClassLoader.getSystemClassLoader());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 获取Person中的属性
		System.out.println("====所有属性====");
		Field[] fieldList = clazz.getDeclaredFields();
		for (Field f : fieldList) {
			System.out.println(f);
		}

		// 获取Person中的方法
		System.out.println("====所有方法=====");
		// Method[] methodList=clazz.getMethods();
		Method[] methodList = clazz.getDeclaredMethods();
		for (Method m : methodList) {
			System.out.println(m);
		}

		// 获取Person中的构造函数
		System.out.println("====所有构造函数=====");
		Constructor[] constructorList = clazz.getDeclaredConstructors();
		for (Constructor c : constructorList) {
			System.out.println(c);
		}

		// 创建Person类的实例并调用其方法
		try {
			// 创建类的实例
			Person obj = (Person) clazz.newInstance();
			obj.setName("刘德华");
			obj.setSex("男");
			obj.setBirthday("1965-10-10");

			// 获取类的方法
			Method method = obj.getClass().getMethod("song", String.class, String.class);

			// 调用类的方法
			Object o = method.invoke(obj, "东方之珠", "粤语版");
			System.out.println(obj.toString());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
