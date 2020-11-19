/**  
* @Title: Person.java
* @Package com.daiinfo.javaadvanced.know4.example.bean
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月18日 下午6:18:01
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example.bean;

/**
* @ClassName: Person
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月18日下午6:18:01
*/

public class Person {
	private int id;
	private String name;
	private int age;
	private int type;

	public Person() {

	}

	public Person(String name, int age, int type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Person[" + id + "," + name + "," + age + "," + type + "]";
	}
}
