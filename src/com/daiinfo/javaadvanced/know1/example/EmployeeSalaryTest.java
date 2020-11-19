/**  
* @Title: EmployeeSalaryTest.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:34:38
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

/**
* @ClassName: EmployeeSalaryTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:34:38
*/

public class EmployeeSalaryTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("001", "张三", "开发部", "经理");
		double countsalary = manager.calculateCount(22, 3, 0);
		System.out.println(countsalary);

		Staff staff = new Staff("2001", "王好", "财务部", "会计师");
		double salary = staff.calculateCount(20, 5, 1);
		System.out.println(salary);
	}
}
