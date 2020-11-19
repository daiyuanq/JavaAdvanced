package com.daiinfo.javaadvanced.know3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectClassTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 获取类加载器
		// ClassLoader classLoader = Student.class.getClassLoader();

		// 常用三种方式加载类
		// 使用ClassLoader.loadClass()来加载类，不会执行初始化块
		/*
		 * try {
		 * classLoader.loadClass("com.daiinfo.javaadvanced.know3.Student"); }
		 * catch (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		// 使用Class.forName(clssName) 来加载类，默认会执行初始化块
		/*
		 * try { Class<?> clazz =
		 * Class.forName("com.daiinfo.javaadvanced.know3.Student");
		 * 
		 * String nClass1=clazz.getName(); String nClass2=clazz.getSimpleName();
		 * String nClass3=clazz.getTypeName();
		 * 
		 * System.out.println(nClass1); System.out.println(nClass2);
		 * System.out.println(nClass3);
		 * 
		 * 
		 * // 通过对象获取类的名称 Student stu = new Student(); String nClass4 =
		 * stu.getClass().getName(); System.out.println(nClass4);
		 * 
		 * // 获取类的父类 Class<?> superClazz = clazz.getSuperclass();
		 * System.out.println(superClazz.getName());
		 * 
		 * // 获取类的实现的接口 Class<?>[] interfaceList = clazz.getInterfaces(); for
		 * (Class<?> interfaceName : interfaceList) {
		 * System.out.println(interfaceName.getName()); }
		 * 
		 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		// 使用Class.forName(className, initialize, ClassLoader)
		// 来加载类，并指定ClassLoader，初始化时不执行静态块.
		// 参数:类名，是否初始化，类加载器
		/*
		 * try { Class.forName("com.daiinfo.javaadvanced.know3.Student", false,
		 * classLoader); } catch (ClassNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// 获取Person类的构造函数
		/*try {
			Class<?> personClazz = Class.forName("com.daiinfo.javaadvanced.know3.Person");
			Constructor<?>[] constructorArray = personClazz.getDeclaredConstructors();

			for (Constructor<?> constructor : constructorArray) {
				System.out.println(constructor.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// 获取Person类的成员变量
		/*try {
			Class<?> personClazz=Class.forName("com.daiinfo.javaadvanced.know3.Person");
			Field [] fieldArray=personClazz.getDeclaredFields();
			for(Field field:fieldArray){
				System.out.println(field.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// 获取Person类的成员方法
		
		/*try {
			Class<?> personClazz=Class.forName("com.daiinfo.javaadvanced.know3.Person");
			Method[] methodArray=personClazz.getDeclaredMethods();
			for(Method method:methodArray){
				System.out.println(method.toGenericString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// 创建新对象并调用其成员方法
		
		try {
			Class<?> personClazz=Class.forName("com.daiinfo.javaadvanced.know3.Person");
			try {
				Method pMethod1=personClazz.getMethod("say");
				pMethod1.invoke(personClazz.newInstance());
				
				Method pMethod2=personClazz.getDeclaredMethod("song",String.class,String.class);
				pMethod2.setAccessible(true);
				Constructor<?> constructor=personClazz.getDeclaredConstructor(String.class);
				Person pObj=(Person) constructor.newInstance("张三");
				pMethod2.invoke(pObj, "长江之歌","粤语");
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
