/**  
* @Title: UpdateBookTest.java
* @Package com.daiinfo.javaadvanced.know8.example.test
* @Description: TODO(用一句话描述该文件做什么)
* @Copyright: Copyright (c) 2019-2021
* @company www.daiinfo.net
* @author 戴远泉  
* @date 2020年11月14日 下午9:26:51
* @version V1.0  
*/

package com.daiinfo.javaadvanced.know8.example.test;

import java.util.ArrayList;
import java.util.List;

import com.daiinfo.javaadvanced.know8.example.bean.Book;
import com.daiinfo.javaadvanced.know8.example.dao.BookDAO;

/**
* @ClassName: UpdateBookTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 戴远泉
* @date 2020年11月14日下午9:26:51
*/

public class UpdateBookTest {

	/**
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO bdao = new BookDAO();
		Book book = new Book("0203", "高级", "戴远泉");
		List<Book> bookList = new ArrayList<Book>();
		bookList = bdao.queryByBookName(book.getBookname());

		for (Book Book : bookList) {
			System.out.println(Book.getId() + "\t" + Book.getBookNo()
					+ "\t" + Book.getBookname() + "\t"
					+ Book.getAuthor());
		}

		book.setId(bookList.get(0).getId());

		book.setBookname("操作系统原理");
		book.setAuthor("王欣");
		book.setPublisher("华中科技大学出版社");
		book.setPublishtime("10170801");

		if (bdao.updateBook(book)) {
			System.out.println("修改成功！");
		} else {
			System.out.println("修改失败！");
		}

	}

}
