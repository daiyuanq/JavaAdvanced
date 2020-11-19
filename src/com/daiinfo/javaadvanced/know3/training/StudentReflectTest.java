/**  
* @Title: StudentReflectTest.java
* @Package com.daiinfo.javaadvanced.know3.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午11:05:06
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know3.training;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
* @ClassName: StudentReflectTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午11:05:06
*/

public class StudentReflectTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 获取Student类的Class对象
		Class<?> studentClazz = null;
		try {
			// studentClazz=Class.forName("com.daiinfo.javaadvanced.know3.training");
			studentClazz = Class.forName("com.daiinfo.javaadvanced.know3.training.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 获取Student类中的所有的字段属性
		System.out.println("Student类中的所有的字段属性:");
		Field[] fieldList = studentClazz.getDeclaredFields();
		for (Field f : fieldList) {
			System.out.println(f);
		}

		// 获取Student类中的所有的方法
		System.out.println("Student类中的所有的方法:");
		Method[] methodList = studentClazz.getDeclaredMethods();
		for (Method m : methodList) {
			System.out.println(m);
		}

		// 获取Student类中的所有的构造函数
		System.out.println("Student类中的所有的构造函数:");
		Constructor[] constructorList = studentClazz.getConstructors();
		for (Constructor c : constructorList) {
			System.out.println(c);
		}

	}

}
