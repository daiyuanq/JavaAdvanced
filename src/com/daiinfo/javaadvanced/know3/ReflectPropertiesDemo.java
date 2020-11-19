package com.daiinfo.javaadvanced.know3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectPropertiesDemo {

	public static void main(String[] args) throws InstantiationException {
		// TODO Auto-generated method stub
		// 读取配置文件
		Properties properties = new Properties();
		Class<?> clazz = null;
		String classname = null;
		try {
			FileInputStream fis = new FileInputStream("src/com/daiinfo/javaadvanced/know3/config.properties");
			properties.load(fis);
			classname = properties.getProperty("classname");
			System.out.println(classname);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 动态加载指定的类
		try {
			clazz = Class.forName(classname);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 调用该类的成员方法
		try {
			Method method = clazz.getDeclaredMethod("print", String.class, int.class, String.class);
			method.setAccessible(true);
			method.invoke(clazz.newInstance(), "李四", 25, "女");

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
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
