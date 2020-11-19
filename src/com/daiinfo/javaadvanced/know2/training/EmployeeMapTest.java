/**  
* @Title: EmployeeMapTest.java
* @Package com.daiinfo.javaadvanced.know2.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午10:35:10
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
* @ClassName: EmployeeMapTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午10:35:10
*/

public class EmployeeMapTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建Map的对象
		// 1.使用实现类。2.使用泛型
		Map<String, Integer> empMap = new HashMap<>();
		empMap.put("张三", 800);
		empMap.put("李四", 1500);
		empMap.put("王五", 3000);

		// 遍历。获取所有的员工
		System.out.println("获取所有的员工：");
		for (String  e: empMap.keySet()) {
			System.out.println(e);
		}
		
		// 遍历。获取所有的员工工资
		System.out.println("获取所有的工资：");
		for (Integer i : empMap.values()) {
			System.out.println(i);
		}
		
		// 查找
		boolean flag=empMap.containsKey("王五");
		System.out.println(flag);
		
		// 删除
		System.out.println("删除以后...");
		empMap.remove("王五");
		for (String  e: empMap.keySet()) {
			System.out.println(e);
		}
		
		// 使用get(Object key)方法对Map集合进行遍历
		System.out.println("get(Object key)对Map集合进行遍历");
		for(String s:empMap.keySet()){
			int v=empMap.get(s);
			System.out.println(s+"...>"+v);
		}
		
		// 使用EntrySet()方法对Map集合进行遍历
		System.out.println("使用EntrySet()方法进行遍历");
		Set<Map.Entry<String,Integer>> entryEmployee=empMap.entrySet();
		for(Entry<String,Integer> e:entryEmployee){
			String s=e.getKey();
			int v=e.getValue();
			System.out.println(s+"--->"+v);
		}
	}

}
