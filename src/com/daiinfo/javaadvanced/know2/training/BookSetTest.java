/**  
* @Title: BookSetTest.java
* @Package com.daiinfo.javaadvanced.know2.training
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月9日 上午10:16:00
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know2.training;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
* @ClassName: BookSetTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月9日上午10:16:00
*/

public class BookSetTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建Set集合的对象
		Set<Book> bookSet=new HashSet<>();
		// 添加数据
		Book book1=new Book(1, "Java基础", "张海");
		Book book2=new Book(2, "Java高级", "戴远泉");
		Book book3=new Book(3, "MySQL", "胡海");
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		
		// 遍历
		for(Book b:bookSet){
			System.out.println(b.toString());
		}
		
		
		// 查找
		System.out.println(bookSet.contains(book2));
		
		// 判空
		System.out.println(bookSet.isEmpty());
		
		// 删除
		bookSet.remove(book1);
		for(Book b:bookSet){
			System.out.println(b.toString());
		}
		
		// 使用迭代器
		System.out.println("使用迭代器...");
		Iterator<Book> it=bookSet.iterator();
		System.out.println(it.next().toString());
		System.out.println("下一个元素：");
		Book b=it.next();
		System.out.println(b.toString());
		
		// 使用迭代器进行遍历
		System.out.println("使用迭代器进行遍历：");
		Iterator<Book> iterator=bookSet.iterator();
		while(iterator.hasNext()){
			Book book=iterator.next();
			System.out.println(book.toString());
		}
	}

}
