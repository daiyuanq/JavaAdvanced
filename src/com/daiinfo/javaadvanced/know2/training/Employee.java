/**  
* @Title: Employee.java
* @Package com.daiinfo.javaadvanced.know2.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午10:31:53
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.training;

/**
* @ClassName: Employee
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午10:31:53
*/

public class Employee {
	int id;
	String name;
	String sex;

	public Employee(int id, String name, String sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return "Employee[" + name + "," + sex + "]";

	}
}
