package com.daiinfo.javaadvanced.know3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> clazz = null;
		try {
			System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
			clazz = Class.forName("com.daiinfo.javaadvanced.know3.Person", false, ClassLoader.getSystemClassLoader());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		Field[] fieldList=clazz.getDeclaredFields();
		for(Field f:fieldList){
			System.out.println(f);
		}
		
		System.out.println("====所有方法=====");
		Method[] methodList=clazz.getMethods();
		for(Method m:methodList){
			System.out.println(m);
		}
		try {
			clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
