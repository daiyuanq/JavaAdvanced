/**  
* @Title: Student.java
* @Package com.daiinfo.javaadvanced.know2.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午8:51:00
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.training;

/**
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午8:51:00
*/

public class Student {
	String no;
	String name;
	String sex;

	/**
	  * Description: 创建一个新的实例 Student.
	  * @param i
	  * @param string
	  * @param string2
	  */
	public Student(String no, String name, String sex) {
		// TODO Auto-generated constructor stub
		this.no=no;
		this.name=name;
		this.sex=sex;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
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
		return "Student[" + no + "," + name + "," + sex + "]";
	}
}
