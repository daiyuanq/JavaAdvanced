/**  
* @Title: StudentSerializableTest.java
* @Package com.daiinfo.javaadvanced.know5.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午2:42:26
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know5.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
* @ClassName: StudentSerializableTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月11日下午2:42:26
*/

public class StudentSerializableTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 从键盘输入学生信息
		System.out.println("********************请输入学生信息******************");
		String s=JOptionPane.showInputDialog("学生学号：");
		long id=Long.parseLong(s);
		String name=JOptionPane.showInputDialog("学生姓名：");
		String cardID=JOptionPane.showInputDialog("身份证号：");
		Student stu = new Student(id,name,cardID);
		System.out.println("*****请输入成绩（当输入'Y'或'y'）******");
		while(1==1){
			String course=JOptionPane.showInputDialog("课程名称：");
			if(course.equals("Y")||course.equals("y")){
				break;
			}
			String scoreString=JOptionPane.showInputDialog("课程成绩：");
			double score=Double.parseDouble(scoreString);
			stu.courseScoreMap.put(course, score);
		}
		
		System.out.println("你读入的学生信息：");
		System.out.println(stu.toString());

		// 序列化
		System.out.println("正在序列化写入文件...");
		File file = new File("D:\\student.dat");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stu);
			oos.flush();
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("信息已保存成功！");

		// 反序列化
		System.out.println("正在读入学生信息...");
		File f = new File("D:\\student.dat");
		Student student = null;
		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			student = (Student) ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		System.out.println("信息已读入成功！");
		// 输出
		student.printStudent();

	}

}
