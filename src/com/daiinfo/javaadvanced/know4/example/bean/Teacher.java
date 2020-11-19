/**  
* @Title: Teacher.java
* @Package com.daiinfo.javaadvanced.know4.example.bean
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月10日 上午9:24:17
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know4.example.bean;

/**
* @ClassName: Teacher
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月10日上午9:24:17
*/

public class Teacher {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String professional;

	public Teacher() {

	}

	public Teacher(String name, String sex) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	@Override
	public String toString() {
		return "Teacher[" + id + "," + name + "," + sex + "," + age + "," + professional + "]";

	}

}
