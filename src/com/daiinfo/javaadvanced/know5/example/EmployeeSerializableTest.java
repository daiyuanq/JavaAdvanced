/**  
* @Title: EmployeeSerializableTest.java
* @Package com.daiinfo.javaadvanced.know5.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午1:43:46
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know5.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
* @ClassName: EmployeeSerializableTest
* @Description: 序列化
* @author 戴远泉
* @date 2020年11月11日下午1:43:46
*/

public class EmployeeSerializableTest {
	/**
	 * 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("中国", "湖北", "武汉");
		Employee employee = new Employee("张三", 21, addr);

		System.out.println(employee.toString());
		File file = new File("D:\\employee.dat");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
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
		System.out.println("序列化完成！");

	}
}
