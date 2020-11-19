package com.daiinfo.javaadvanced.know3;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlIDREF;

/**
 * 
* <p>Title: Student</p>  
* <p>Description: </p>  
* @author 戴远泉 
* @date 2020年7月31日 上午9:48:23
* @version V1.0
 */
public class Student {
	String sName;
	int age;
	int enrolmentYear; // 入学年级
	String specialty;  // 所学专业
	
	public  Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String sName,int age){
		this.sName=sName;
		this.age=age;
	}
}
