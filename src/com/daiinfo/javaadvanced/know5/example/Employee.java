/**  
* @Title: Employee.java
* @Package com.daiinfo.javaadvanced.know5.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午1:42:34
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know5.example;

import java.io.Serializable;

/**
* @ClassName: Employee
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月11日下午1:42:34
*/

public class Employee implements Serializable {
	private static final long serialVersionUID = 6016885061798226660L;
	private String name; // 表示员工的姓名
	private int age; // 表示员工的年龄
	private Address addr;// 引用类型

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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.addr = address;
	}

	// 重写toString()方法
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("姓名：" + name + ", ");
		sb.append("年龄：" + age + "\n");
		sb.append("地址：" + addr);
		return sb.toString();
	}
}
