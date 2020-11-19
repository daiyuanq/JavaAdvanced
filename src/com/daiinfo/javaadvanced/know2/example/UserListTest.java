/**  
* @Title: UserListTest.java
* @Package com.daiinfo.javaadvanced.know2.example
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月6日 下午9:42:12
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
* @ClassName: UserListTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月6日下午9:42:12
*/

public class UserListTest {
	public static void main(String[] args) {
		// 使用List接口的实现类创建list对象
		List<User> userList = new ArrayList<User>();
		// 向list中添加对象
		userList.add(new User("小明", "xiaoming@qq.com"));
		User xiaozhang = new User("小张", "xiaozhang@qq.com");
		userList.add(xiaozhang);

		// 使用set()方法替换列表中指定位置的元素
		User xiaohu = new User("小胡", "xiaohu@qq.com");
		userList.set(1, xiaohu);

		// 删除指定位置的元素
		//list.remove(1);

		// 列表迭代器的用法。listIterator()方法返回此列表元素的列表迭代器。
		ListIterator<User> iterator = userList.listIterator();
		User u=iterator.next();
		System.out.println(u.toString());
		System.out.println("后面还有没有元素？"+iterator.hasNext());

		// 几种遍历list的方法
		// 方法1：迭代器，使用while循环
		System.out.println("遍历方法1的结果！");
		ListIterator<User> it1 = userList.listIterator();
		while (it1.hasNext()) {
			User user = it1.next();
			System.out.println(u.toString());
		}

		// 方法2：迭代器，使用for循环
		System.out.println("遍历方法2的结果！");
		for (Iterator<User> it2 = userList.iterator(); it2.hasNext();) {
			User user = it2.next();
			System.out.println(user.toString());
		}

		// 方法3：使用foreach遍历List
		// 此方法需重点掌握。这种方法在遍历数组和Map集合的时候同样适用。
		System.out.println("遍历方法3的结果！"+"此方法需重点掌握");
		for (User tmp : userList) {
			System.out.println(tmp.toString());
		}

		// 方法4:for循环，指定下标长度，使用List集合的size()方法，进行for循环遍历
		System.out.println("遍历方法4的结果！");
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).toString());
		}

	}

}
