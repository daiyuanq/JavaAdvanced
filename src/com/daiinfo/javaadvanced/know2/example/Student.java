/**  
* @Title: Student.java
* @Package com.daiinfo.javaadvanced.know2.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午10:33:19
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.example;

/**
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午10:33:19
*/

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student[" + name + "," + age + "]";
	}

}
