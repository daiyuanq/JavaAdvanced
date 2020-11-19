/**  
* @Title: Employee.java
* @Package com.daiinfo.javaadvanced.know1.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:25:47
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know1.example;

/**
* @ClassName: Employee
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:25:47
*/

public class Employee {
	String ID;
	String name;

	int workdays;// 工作天数
	int overtimedays;// 加班天数
	int absencedays;// 缺勤天数
	double salary;// 月工资

	/**
	 * 
	  * Description: 创建一个新的实例 Employee.
	  * @param ID
	 */
	public Employee(String ID) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
	}

	/**
	 * 
	  * Description: 创建一个新的实例 Employee.
	  * @param ID
	  * @param name
	 */
	public Employee(String ID, String name) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.name = name;
	}

	/**
	 * 
	* @Title: calculateCount
	* @Description: 计算员工的工资
	* @param @param workdays 工作天数
	* @param @param overtimedays 加班天数
	* @param @param absencedays 缺勤天数
	* @param @return 返回月工资总数
	* @return double
	* @throws
	 */
	double calculateCount(int workdays, int overtimedays, int absencedays) {
		double count = 0.0;
		count = 80.0 * workdays + 80 * overtimedays - 30 * absencedays;
		return count;
	}

	/**
	 * 转换为字符串输出
	 */
	@Override
	public String toString() {
		return name + "\t" + salary;
	}
}
