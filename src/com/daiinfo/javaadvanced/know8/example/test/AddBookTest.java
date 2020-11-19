/**  
* @Title: AddBookTest.java
* @Package com.daiinfo.javaadvanced.know8.example.test
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午8:49:41
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.test;

import com.daiinfo.javaadvanced.know8.example.bean.Book;
import com.daiinfo.javaadvanced.know8.example.dao.BookDAO;

/**
* @ClassName: AddBookTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月14日下午8:49:41
*/

public class AddBookTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO bookInfoDAO = new BookDAO();
		Book book = new Book(null, null, null);
		book.setBookNo("08803");
		book.setBookname("Java高级程序设计");
		book.setAuthor("戴远泉");
		book.setPublisher("高等教育出版社");
		book.setPublishtime("20170809");
		book.setAmount(4);
		book.setPrice(45.05);
		book.setISBN("98745372123");
		if(bookInfoDAO.addBook(book))
		   System.out.println("添加成功！");
		else {
			System.out.println("添加失败！");
		}
	}

}
