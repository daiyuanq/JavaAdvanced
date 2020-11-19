/**  
* @Title: Teacher.java
* @Package com.daiinfo.javaadvanced.know2.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月7日 上午12:07:57
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.example;

/**
* @ClassName: Teacher
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月7日上午12:07:57
*/

public class Teacher {
	String name;
	String sex;

	public Teacher(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Teacher[" + name + "," + sex + "]";

	}
}
