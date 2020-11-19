package com.daiinfo.javaadvanced.know3;

import java.lang.reflect.Field;

public class ClassInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("测试开始");
		Person p=new Person();
		
		// 1.获得Class对象
		// (1)通过反射机制得到Class的对象
		Class<?> clazz1=p.getClass();
		System.out.println(clazz1.getName());
		
		// (2)如果在编译期知道类的名字则直接使用完整类名
		Class<?> clazz2=com.daiinfo.javaadvanced.know3.Person.class;
		System.out.println(clazz1.toString());
		
		// (3)如果类名在编译器不知道，但是在运行期可以获得，可以使用下面的方法获得Class对象
		try {
			Class<?> clazz3 = Class.forName("com.daiinfo.javaadvanced.know3.Person");
			System.out.println(clazz3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2.使用Java API获取相关信息。此例获取该类中的成员变量
		Field[] fieldList=clazz1.getFields();
		
		// 3.处理相关信息
		for(Field field:fieldList){
			field.setAccessible(true);
			System.out.println(field.toString());
		}
	}
}
