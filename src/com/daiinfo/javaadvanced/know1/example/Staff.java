/**  
* @Title: Staff.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:30:11
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

/**
* @ClassName: Staff
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:30:11
*/

public class Staff extends Employee {
	double bassewages = 2000;
	double dailywages = 50;// 日工资
	String department;
	String technicaltitle;

	/**
	 * 
	  * Description: 创建一个新的实例 Staff.
	  * @param ID
	  * @param name
	  * @param department
	  * @param technicaltitle
	 */
	public Staff(String ID, String name, String department, String technicaltitle) {
		super(ID, name);
		this.department = department;
		this.technicaltitle = technicaltitle;
	}

	/**
	 * 计算员工的工资
	 * @param workdays 工作天数
	 * @param overtimedays 加班天数
	 * @param absencedays 缺勤天数
	 * @return 返回月工资总数
	 */
	double calculateCount(int workdays, int overtimedays, int absencedays) {
		double count = 0.0;
		count = bassewages + dailywages * overtimedays - dailywages * absencedays;
		return count;
	}

	@Override
	public String toString() {
		return name + "\t" + salary;
	}
}
