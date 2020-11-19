package com.daiinfo.javaadvanced.know3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassLoadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.通过new创建对象进行加载类
		// new 创建对象，是静态加载类，在编译时刻就需要加载所有的可能使用到的类
		Class<?> clazzPerson=null;
		
		try {
			Person p = new Person();
			clazzPerson = p.getClass();
			System.out.println(clazzPerson.toString());
			Person cPerson = Person.class.newInstance();
			cPerson.setName("张三");
			System.out.println(cPerson.toString());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2.通过Class.forName()来加载类
		try {
			Class<?> clazzStudent=Class.forName("com.daiinfo.javaadvanced.know3.Student");
			System.out.println(clazzStudent.toString());
			Student cStudent=(Student) clazzStudent.newInstance();
			System.out.println(cStudent.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3.通过类加载器ClassLoader的loadClass()方法来加载类
		try {
			Class<?> clazzTeacher=ClassLoader.getSystemClassLoader()
					.loadClass("com.daiinfo.javaadvanced.know3.Teacher");
			System.out.println(clazzTeacher.toString());
			Teacher cTeacher=(Teacher)clazzTeacher.newInstance();
			System.out.println(cTeacher.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 获取类的所有属性
		Field[] fieldList=clazzPerson.getDeclaredFields();
		for(Field f:fieldList){
			System.out.println(f);
		}
		
		// 获取类的所有方法
		Method[] methodList=clazzPerson.getMethods();
		for(Method m:methodList){
			System.out.println(m);
		}
		
		System.out.println(clazzPerson.getClassLoader().getClass().toString());
	}

}
