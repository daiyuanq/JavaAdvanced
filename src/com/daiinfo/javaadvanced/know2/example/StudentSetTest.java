/**  
* @Title: StudentSetTest.java
* @Package com.daiinfo.javaadvanced.know2.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午10:36:15
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.example;

import java.util.HashSet;
import java.util.Iterator;

/**
* @ClassName: StudentSetTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午10:36:15
*/

public class StudentSetTest {
	public static void main(String[] args) {
		// 使用HashSet接口的实现类来创建HashSet的对象
		HashSet<Student> studentSet = new HashSet<Student>();

		// 向Set集合中添加元素
		Student stu1 = new Student("张三", 18);
		Student stu2 = new Student("李四", 20);
		Student stu3 = new Student("王五", 19);
		studentSet.add(stu1);
		studentSet.add(stu2);
		studentSet.add(stu3);

		// 删除指定的元素
		studentSet.remove(stu2);

		// 判断Set集合中是否包含指定的元素
		boolean isContain = false;
		isContain = studentSet.contains(stu1);
		System.out.println("此Set集合中是否包含stu1?" + isContain);

		// 使用迭代器Iterator
		Iterator<Student> iterator = studentSet.iterator();
		Student s = iterator.next();
		System.out.println("此Set集合中第一个元素是：" + s.toString());
		System.out.println("还有没有下一个元素？" + iterator.hasNext());
		System.out.println("下一个是：" + iterator.next());

		// 遍历
		// 方法1：使用迭代器Iterator进行遍历
		System.out.println("使用迭代器Iterator进行遍历的结果：");
		Iterator<Student> it = studentSet.iterator();
		while (it.hasNext()) {
			Student student1 = it.next();
			System.out.println(student1.toString());
		}
		// 方法2：使用foreach进行遍历
		System.out.println("使用foreach进行遍历的结果：");
		for (Student student2 : studentSet) {
			System.out.println(student2.toString());
		}
	}
}
