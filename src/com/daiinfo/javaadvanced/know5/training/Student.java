/**  
* @Title: Student.java
* @Package com.daiinfo.javaadvanced.know5.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午2:17:32
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know5.training;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月11日下午2:17:32
*/

public class Student implements Serializable{
	long id; // 学号
	String name;
	String cardID; // 身份证号
	Map<String, Double> courseScoreMap=null;
	
	public Student(){
		courseScoreMap=new HashMap<String, Double>();
	}
	public Student(Long id,String name,String cardID){
		courseScoreMap=new HashMap<String, Double>();
		this.id=id;
		this.name=name;
		this.cardID=cardID;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardID() {
		return cardID;
	}
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	
	@Override
	public String toString(){
		return "学生["+id+","+name+","+cardID+","+courseScoreMap+"]";
	}
	
	public void  printStudent(){
		System.out.println("********************学生信息******************");
		System.out.println("        学生学号              学生姓名          身份证号    ");
		System.out.println("        "+id+"    "+name+"    "+cardID);
		System.out.println("********各科成绩*********");
		System.out.println("      课程              成绩 ");
		double average=0.0;
		double total=0.0;
		for(Entry<String, Double> entry:courseScoreMap.entrySet()){
			String course=entry.getKey();
			double score=entry.getValue();
			total=total+score;
			System.out.println("    "+course+"     "+score);
		}
		average=total/courseScoreMap.size();
		DecimalFormat df=new DecimalFormat("0.0");
		System.out.println("平均成绩："+df.format(average));
	}
}
