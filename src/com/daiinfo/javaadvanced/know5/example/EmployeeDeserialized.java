/**  
* @Title: EmployeeDeserialized.java
* @Package com.daiinfo.javaadvanced.know5.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月11日 下午1:52:38
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know5.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
* @ClassName: EmployeeDeserialized
* @Description: 反序列化
* @author 戴远泉
* @date 2020年11月11日下午1:52:38
*/

public class EmployeeDeserialized {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("", "", "");
		Employee employee = new Employee("", 0, null);

		File file = new File("D:\\employee.dat");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee=(Employee) ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(employee.toString());
	}

}
