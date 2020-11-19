/**  
* @Title: Student.java
* @Package com.daiinfo.javaadvanced.know3.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午11:01:46
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know3.training;

/**
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午11:01:46
*/

public class Student {
	String name;
	int age;

	/**
	 * 
	  * Description: 创建一个新的实例 Student.
	 */
	public Student() {

	}

	/**
	 * 
	  * Description: 创建一个新的实例 Student.
	  * @param name
	  * @param age
	 */
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
