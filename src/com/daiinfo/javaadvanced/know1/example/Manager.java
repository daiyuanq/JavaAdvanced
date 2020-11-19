/**  
* @Title: Manager.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:32:53
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

/**
* @ClassName: Manager
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:32:53
*/

public class Manager extends Employee {
	double basewages = 3000;
	String department;// 所在部门
	String positions;

	/**
	 * 构造函数
	 * @param ID
	 * @param name
	 * @param department
	 */
	public Manager(String ID, String name, String department, String positions) {
		// TODO Auto-generated constructor stub
		super(ID, name);
		this.department = department;
		this.positions = positions;

	}

	/**
	 * 计算经理的工资
	 * @param workdays 工作天数
	 * @param overtimedays 加班天数
	 * @param absencedays 缺勤天数
	 * @return 返回月工资总数
	 */
	double calculateCount(int workdays, int overtimedays, int absencedays) {
		double count = 0.0;
		count = basewages + 20 * overtimedays - 30 * absencedays;
		return count;
	}
}
