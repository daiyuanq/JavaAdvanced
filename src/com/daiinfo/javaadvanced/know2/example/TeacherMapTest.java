/**  
* @Title: TeacherMapTest.java
* @Package com.daiinfo.javaadvanced.know2.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月7日 上午12:11:17
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
* @ClassName: TeacherMapTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月7日上午12:11:17
*/

public class TeacherMapTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用Map接口的实现类创建Map对象。
		// Key表示教师的工号，V表示教师。
		Map<String, Teacher> teacherMap = new HashMap<String, Teacher>();

		// 向Map中添加元素
		Teacher teac1 = new Teacher("张三", "男");
		Teacher teac2 = new Teacher("李四", "女");
		Teacher teac3 = new Teacher("王五", "男");
		teacherMap.put("001", teac1);
		teacherMap.put("102", teac2);
		teacherMap.put("201", teac3);

		// 刪除指定的元素
		teacherMap.remove("001");

		// 替换指定的元素
		Teacher teacher = new Teacher("李思", "女");
		teacherMap.replace("102", teac2, teacher);

		// 查找Map中是否存在某个key值或value值
		System.out.println("此Map中是否包含工号202?" + teacherMap.containsKey("202"));
		System.out.println("此Map中是否包含teac3?" + teacherMap.containsValue(teac3));

		// 返回Map集合中所有的Key
		System.out.println("所有的工号：");
		for (String s : teacherMap.keySet()) {
			System.out.println(s);
		}

		// 返回Map集合中所有的Value
		System.out.println("所有的教师：");
		for (Teacher t : teacherMap.values()) {
			System.out.println(t.toString());
		}

		// entrySet()的使用。
		// 此方法返回包含映射关系的Set集合。
		System.out.println("entrySet()方法的使用...");
		Set<Map.Entry<String, Teacher>> entrySet = teacherMap.entrySet();
		for (Entry<String, Teacher> entry : entrySet) {
			String s = entry.getKey();
			Teacher t = entry.getValue();
			System.out.println(s + "," + t.getName() + "," + t.getSex());
		}

		// 遍历Map
		// 方法1：首先获取Map中所有的Key，再通过Key获取Value值
		System.out.println("通过Key获取Value进行遍历：");
		for (String s : teacherMap.keySet()) {
			Teacher t = teacherMap.get(s);
			System.out.println(t.toString());
		}
		// 方法2：获取Map中所有的Value
		System.out.println("通过获取Map中所有的Value进行遍历：");
		for (Teacher t : teacherMap.values()) {
			System.out.println(t.toString());
		}

		// 方法3：通过entrySet()进行遍历
		System.out.println("通过entrySet()进行遍历:");
		for (Entry<String, Teacher> teac : teacherMap.entrySet()) {
			String s = teac.getKey();
			Teacher t = teac.getValue();
			System.out.println(s + "," + t.toString());
		}

	}

}
