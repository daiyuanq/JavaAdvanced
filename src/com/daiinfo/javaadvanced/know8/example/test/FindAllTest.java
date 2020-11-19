/**  
* @Title: FindAllTest.java
* @Package com.daiinfo.javaadvanced.know8.example.test
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午9:15:23
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.test;

import java.util.List;

import com.daiinfo.javaadvanced.know8.example.bean.Book;
import com.daiinfo.javaadvanced.know8.example.dao.BookDAO;

/**
* @ClassName: FindAllTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月14日下午9:15:23
*/

public class FindAllTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO bookDAO = new BookDAO();
		List<Book> books = bookDAO.findAll();
		for (Book bookInfo : books) {
			System.out.println(bookInfo.getId() + "\t" + bookInfo.getBookNo() + "\t" + bookInfo.getBookname() + "\t"
					+ bookInfo.getAuthor());
		}
	}

}
