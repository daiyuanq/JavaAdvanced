/**  
* @Title: StudentListTest.java
* @Package com.daiinfo.javaadvanced.know2.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午8:57:02
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
* @ClassName: StudentListTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午8:57:02
*/

public class StudentListTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建List对象
		List<Student> studentList = new ArrayList<>();

		// 生成学生对象
		Student stu1 = new Student("001", "张三", "男");
		Student stu2 = new Student("002", "李四", "女");
		Student stu3 = new Student("004", "王五", "男");

		// 添加到List中
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);

		// 遍历
		for (Student s : studentList) {
			System.out.println(s.toString());
		}

		// 添加到末尾
		Student stu = new Student("007", "刘海", "男");
		studentList.add(stu);

		for (Student s : studentList) {
			System.out.println(s.toString());
		}

		// 制定位置添加
		Student stu4 = new Student("009", "胡梅", "女");
		studentList.add(1, stu4);

		for (Student s : studentList) {
			System.out.println(s.toString());
		}

		// 删除指定元素
		studentList.remove(2);
		System.out.println("删除之后...");
		for (Student s : studentList) {
			System.out.println(s.toString());
		}

		// 查找指定的元素
		System.out.println(studentList.contains(stu));

		// 排序
		// 匿名类Comparator
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				// 为空的要剔除掉
				if (s1.getNo() == null || s2.getNo() == null) {
					return 0;
				}
				;
				return (int) (s1.getNo().compareTo(s2.getNo()));
			}
		};
		studentList.sort(comparator);
		System.out.println("排序后...");
		for (Student s : studentList) {
			System.out.println(s.toString());
		}

		// 转换为数组
		Object[] studentArray = studentList.toArray();
		System.out.println("按数组输出...");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].toString());
		}
	}

}
